package com.example.a16023018.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        //Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        //Get the TextView object
        TextView tvD = (TextView)findViewById(R.id.textViewDisplay);
        //Display the name and age on the TextView
        tvD.setText(info[0] + "\n "+info[1] + "\n"+info[2] + "\n"+info[3] );
    }
}
