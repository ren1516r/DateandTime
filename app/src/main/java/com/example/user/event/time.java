package com.example.user.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class time extends AppCompatActivity {
private TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);


      /*  String hour = String.valueOf(timePicker.getCurrentHour());
        String minute = String.valueOf(timePicker.getCurrentMinute());*/

//        Toast.makeText(getApplicationContext(),timePicker.getCurrentHour(),LENGTH_LONG).show();
    }
}
