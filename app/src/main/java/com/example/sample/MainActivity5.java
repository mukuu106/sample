package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button m = findViewById(R.id.button8);
        Button t= findViewById(R.id.button9);
        Button w = findViewById(R.id.button10);
        Button th= findViewById(R.id.button11);
        Button f = findViewById(R.id.button12);
        Button sat = findViewById(R.id.button13);
        Button sun = findViewById(R.id.button14);



        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                startActivity(new Intent(MainActivity5.this,mon_nonvegMainActivity6.class));
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity5.this,tue_nonvegMainActivity7.class));
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity5.this,wed_nonvegMainActivity8.class));
            }
        });
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity5.this,thur_nonvegMainActivity9.class));
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity5.this,fri_nonvegMainActivity10.class));
            }
        });
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity5.this,sat_nonvegMainActivity11.class));
            }
        });
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity5.this, sun_nonvegMainActivity12.class));
            }
        });





    }
}