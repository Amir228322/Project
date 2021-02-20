package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class italian_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_opening);
    }

    public void onClick_italian_back(View view) {
        Intent italian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(italian_intent_back);
    }

}