package com.example.user.event;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.security.PublicKey;
import java.sql.Date;
import java.sql.Time;

import static com.example.user.event.R.id.time;
import static com.example.user.event.R.id.timePicker;

public class MainActivity extends AppCompatActivity {

    private Button b_time;
    public Date date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b_time=(Button)findViewById(R.id.bt_time);

        b_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,time.class);
                startActivity(i);
            }
        });

    }
}
