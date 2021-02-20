package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class queens_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queens_opening);
    }

    public void onClick_queens_back(View view) {
        Intent queens_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(queens_intent_back);
    }

}