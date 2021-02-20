package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class indian_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_opening);
    }

    public void onClick_indian_back(View view) {
        Intent indian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(indian_intent_back);
    }

}