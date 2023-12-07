package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void PregnancyDiet(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivities(new Intent[]{intent});
    }


    public void PCOSDiet(View view) {
        Intent intentt = new Intent(this, MainActivity3.class);
        startActivities(new Intent[]{intentt});

    }

    }

