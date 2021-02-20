package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class opening_main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_main_activity);
    }

    public void onClick_opennings_back1(View view) {
        Intent openings_intent_back1 = new Intent(this, MainActivity.class);
        startActivity(openings_intent_back1);
    }

}