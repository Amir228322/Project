package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Practice_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_);
    }
    public void onClick_opennings_back2(View view) {
        Intent openings_intent_back2 = new Intent(this, MainActivity.class);
        startActivity(openings_intent_back2);
    }
}