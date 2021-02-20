package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class carokan_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carokan_opening);
    }

    public void onClick_carokan_back(View view) {
        Intent carokan_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(carokan_intent_back);
    }

}