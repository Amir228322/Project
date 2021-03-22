package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class italian_opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_opening);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//
        getSupportActionBar().hide();

    }

    public void onClick_italian_back(View view) {
        Intent italian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(italian_intent_back);
    }
    int count = 1;
    public void onClick_italian_next(View view){
        ImageButton a1 = (ImageButton)findViewById(R.id.a1);
        ImageButton a2 = (ImageButton)findViewById(R.id.a2);
        ImageButton a3 = (ImageButton)findViewById(R.id.a3);
        ImageButton a4 = (ImageButton)findViewById(R.id.a4);
        ImageButton a5 = (ImageButton)findViewById(R.id.a5);
        ImageButton a6 = (ImageButton)findViewById(R.id.a6);
        ImageButton a7 = (ImageButton)findViewById(R.id.a7);
        ImageButton a8 = (ImageButton)findViewById(R.id.a8);
        ImageButton b1 = (ImageButton)findViewById(R.id.b1);
        ImageButton b2 = (ImageButton)findViewById(R.id.b2);
        ImageButton b3 = (ImageButton)findViewById(R.id.b3);
        ImageButton b4 = (ImageButton)findViewById(R.id.b4);
        ImageButton b5 = (ImageButton)findViewById(R.id.b5);
        ImageButton b6 = (ImageButton)findViewById(R.id.b6);
        ImageButton b7 = (ImageButton)findViewById(R.id.b7);
        ImageButton b8 = (ImageButton)findViewById(R.id.b8);
        ImageButton c1 = (ImageButton)findViewById(R.id.c1);
        ImageButton c2 = (ImageButton)findViewById(R.id.c2);
        ImageButton c3 = (ImageButton)findViewById(R.id.c3);
        ImageButton c4 = (ImageButton)findViewById(R.id.c4);
        ImageButton c5 = (ImageButton)findViewById(R.id.c5);
        ImageButton c6 = (ImageButton)findViewById(R.id.c6);
        ImageButton c7 = (ImageButton)findViewById(R.id.c7);
        ImageButton c8 = (ImageButton)findViewById(R.id.c8);
        ImageButton d1 = (ImageButton)findViewById(R.id.d1);
        ImageButton d2 = (ImageButton)findViewById(R.id.d2);
        ImageButton d3 = (ImageButton)findViewById(R.id.d3);
        ImageButton d4 = (ImageButton)findViewById(R.id.d4);
        ImageButton d5 = (ImageButton)findViewById(R.id.d5);
        ImageButton d6 = (ImageButton)findViewById(R.id.d6);
        ImageButton d7 = (ImageButton)findViewById(R.id.d7);
        ImageButton d8 = (ImageButton)findViewById(R.id.d8);
        ImageButton e1 = (ImageButton)findViewById(R.id.e1);
        ImageButton e2 = (ImageButton)findViewById(R.id.e2);
        ImageButton e3 = (ImageButton)findViewById(R.id.e3);
        ImageButton e4 = (ImageButton)findViewById(R.id.e4);
        ImageButton e5 = (ImageButton)findViewById(R.id.e5);
        ImageButton e6 = (ImageButton)findViewById(R.id.e6);
        ImageButton e7 = (ImageButton)findViewById(R.id.e7);
        ImageButton e8 = (ImageButton)findViewById(R.id.e8);
        ImageButton f1 = (ImageButton)findViewById(R.id.f1);
        ImageButton f2 = (ImageButton)findViewById(R.id.f2);
        ImageButton f3 = (ImageButton)findViewById(R.id.f3);
        ImageButton f4 = (ImageButton)findViewById(R.id.f4);
        ImageButton f5 = (ImageButton)findViewById(R.id.f5);
        ImageButton f6 = (ImageButton)findViewById(R.id.f6);
        ImageButton f7 = (ImageButton)findViewById(R.id.f7);
        ImageButton f8 = (ImageButton)findViewById(R.id.f8);
        ImageButton g1 = (ImageButton)findViewById(R.id.g1);
        ImageButton g2 = (ImageButton)findViewById(R.id.g2);
        ImageButton g3 = (ImageButton)findViewById(R.id.g3);
        ImageButton g4 = (ImageButton)findViewById(R.id.g4);
        ImageButton g5 = (ImageButton)findViewById(R.id.g5);
        ImageButton g6 = (ImageButton)findViewById(R.id.g6);
        ImageButton g7 = (ImageButton)findViewById(R.id.g7);
        ImageButton g8 = (ImageButton)findViewById(R.id.g8);
        ImageButton h1 = (ImageButton)findViewById(R.id.h1);
        ImageButton h2 = (ImageButton)findViewById(R.id.h2);
        ImageButton h3 = (ImageButton)findViewById(R.id.h3);
        ImageButton h4 = (ImageButton)findViewById(R.id.h4);
        ImageButton h5 = (ImageButton)findViewById(R.id.h5);
        ImageButton h6 = (ImageButton)findViewById(R.id.h6);
        ImageButton h7 = (ImageButton)findViewById(R.id.h7);
        ImageButton h8 = (ImageButton)findViewById(R.id.h8);
        switch(count){
            case 1:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                break;
            case 2:
                g2.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                break;
        }

    }

}