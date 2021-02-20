package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sicilian_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sicilian_opening);
    }

    public void onClick_sicilian_back(View view) {
        Intent sicilian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(sicilian_intent_back);
    }

}