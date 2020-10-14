package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureButton();
    }
    private void configureButton() {
        Button b = (Button) findViewById(R.id.e1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                English.as = 65;
                English.range = 26;
                changeActivity();
            }
        });
        b = (Button) findViewById(R.id.e2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                English.as = 2309;
                English.range = 53;
                changeActivity();
            }
        });
        b = (Button) findViewById(R.id.e3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                English.as =1575;
                English.range =35;
                changeActivity();
            }
        });b = (Button) findViewById(R.id.e3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                English.as =1575;
                English.range =35;
                changeActivity();
            }
        });b = (Button) findViewById(R.id.e4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                English.as =2433;
                English.range =56;
                changeActivity();
            }
        });
    }
    private void changeActivity(){
        startActivity(new Intent(this,English.class));//Activty change
    }
    Intent intent = new Intent(Intent.ACTION_SENDTO);

}