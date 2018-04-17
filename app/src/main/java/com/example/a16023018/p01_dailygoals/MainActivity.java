package com.example.a16023018.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOk = (Button)findViewById(R.id.buttonOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroup1);
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton)findViewById(selectedButtonId1);

                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton)findViewById(selectedButtonId2);

                RadioGroup rg3 = (RadioGroup)findViewById(R.id.radioGroup3);
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton)findViewById(selectedButtonId3);

                EditText et = (EditText)findViewById(R.id.editText);


                String[] info = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(),et.getText().toString()};
                //Create an intent to start another activity called
                //DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,Activity2.class);
                //Pass the String array holding the name & age to new activity
                i.putExtra("info",info);
                //Start the new activity
                startActivity(i);

            }
        });
    }
}
