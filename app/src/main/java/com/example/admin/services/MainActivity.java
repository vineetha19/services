package com.example.admin.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonStart, buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.start1);
        buttonStop = findViewById(R.id.stop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start1:

                startService(new Intent(this, MyService.class));
                break;
            case R.id.stop:
                stopService(new Intent(this, MyService.class));
                break;


        }
    }
}


