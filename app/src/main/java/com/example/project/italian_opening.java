package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class italian_opening extends AppCompatActivity {
    ImageButton a1; ImageButton a2;
    ImageButton a3; ImageButton a4;
    ImageButton a5; ImageButton a6;
    ImageButton a7; ImageButton a8;

    ImageButton b1; ImageButton b2;
    ImageButton b3; ImageButton b4;
    ImageButton b5; ImageButton b6;
    ImageButton b7; ImageButton b8;

    ImageButton c1; ImageButton c2;
    ImageButton c3; ImageButton c4;
    ImageButton c5; ImageButton c6;
    ImageButton c7; ImageButton c8;

    ImageButton d1; ImageButton d2;
    ImageButton d3; ImageButton d4;
    ImageButton d5; ImageButton d6;
    ImageButton d7; ImageButton d8;

    ImageButton e1; ImageButton e2;
    ImageButton e3; ImageButton e4;
    ImageButton e5; ImageButton e6;
    ImageButton e7; ImageButton e8;

    ImageButton f1; ImageButton f2;
    ImageButton f3; ImageButton f4;
    ImageButton f5; ImageButton f6;
    ImageButton f7; ImageButton f8;

    ImageButton g1; ImageButton g2;
    ImageButton g3; ImageButton g4;
    ImageButton g5; ImageButton g6;
    ImageButton g7; ImageButton g8;

    ImageButton h1; ImageButton h2;
    ImageButton h3; ImageButton h4;
    ImageButton h5; ImageButton h6;
    ImageButton h7; ImageButton h8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_opening);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//
        getSupportActionBar().hide();

        a1 = (ImageButton)findViewById(R.id.a1); a2 = (ImageButton)findViewById(R.id.a2);
        a3 = (ImageButton)findViewById(R.id.a3); a4 = (ImageButton)findViewById(R.id.a4);
        a5 = (ImageButton)findViewById(R.id.a5); a6 = (ImageButton)findViewById(R.id.a6);
        a7 = (ImageButton)findViewById(R.id.a7); a8 = (ImageButton)findViewById(R.id.a8);

        b1 = (ImageButton)findViewById(R.id.b1); b2 = (ImageButton)findViewById(R.id.b2);
        b3 = (ImageButton)findViewById(R.id.b3); b4 = (ImageButton)findViewById(R.id.b4);
        b5 = (ImageButton)findViewById(R.id.b5); b6 = (ImageButton)findViewById(R.id.b6);
        b7 = (ImageButton)findViewById(R.id.b7); b8 = (ImageButton)findViewById(R.id.b8);

        c1 = (ImageButton)findViewById(R.id.c1); c2 = (ImageButton)findViewById(R.id.c2);
        c3 = (ImageButton)findViewById(R.id.c3); c4 = (ImageButton)findViewById(R.id.c4);
        c5 = (ImageButton)findViewById(R.id.c5); c6 = (ImageButton)findViewById(R.id.c6);
        c7 = (ImageButton)findViewById(R.id.c7); c8 = (ImageButton)findViewById(R.id.c8);

        d1 = (ImageButton)findViewById(R.id.d1); d2 = (ImageButton)findViewById(R.id.d2);
        d3 = (ImageButton)findViewById(R.id.d3); d4 = (ImageButton)findViewById(R.id.d4);
        d5 = (ImageButton)findViewById(R.id.d5); d6 = (ImageButton)findViewById(R.id.d6);
        d7 = (ImageButton)findViewById(R.id.d7); d8 = (ImageButton)findViewById(R.id.d8);

        e1 = (ImageButton)findViewById(R.id.e1); e2 = (ImageButton)findViewById(R.id.e2);
        e3 = (ImageButton)findViewById(R.id.e3); e4 = (ImageButton)findViewById(R.id.e4);
        e5 = (ImageButton)findViewById(R.id.e5); e6 = (ImageButton)findViewById(R.id.e6);
        e7 = (ImageButton)findViewById(R.id.e7); e8 = (ImageButton)findViewById(R.id.e8);

        f1 = (ImageButton)findViewById(R.id.f1); f2 = (ImageButton)findViewById(R.id.f2);
        f3 = (ImageButton)findViewById(R.id.f3); f4 = (ImageButton)findViewById(R.id.f4);
        f5 = (ImageButton)findViewById(R.id.f5); f6 = (ImageButton)findViewById(R.id.f6);
        f7 = (ImageButton)findViewById(R.id.f7); f8 = (ImageButton)findViewById(R.id.f8);

        g1 = (ImageButton)findViewById(R.id.g1); g2 = (ImageButton)findViewById(R.id.g2);
        g3 = (ImageButton)findViewById(R.id.g3); g4 = (ImageButton)findViewById(R.id.g4);
        g5 = (ImageButton)findViewById(R.id.g5); g6 = (ImageButton)findViewById(R.id.g6);
        g7 = (ImageButton)findViewById(R.id.g7); g8 = (ImageButton)findViewById(R.id.g8);

        h1 = (ImageButton)findViewById(R.id.h1); h2 = (ImageButton)findViewById(R.id.h2);
        h3 = (ImageButton)findViewById(R.id.h3); h4 = (ImageButton)findViewById(R.id.h4);
        h5 = (ImageButton)findViewById(R.id.h5); h6 = (ImageButton)findViewById(R.id.h6);
        h7 = (ImageButton)findViewById(R.id.h7); h8 = (ImageButton)findViewById(R.id.h8);

    }

    public void onClick_italian_back(View view) {
        Intent italian_intent_back = new Intent(this, opening_main_activity.class);
        startActivity(italian_intent_back);
    }
    int count = 1;
    public void onClick_italian_next(View view){
        switch(count){
            case 1:
                e2.setForeground(null);
                e4.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.40");
                break;

            case 2:
                e7.setForeground(null);
                e5.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.53");
                break;

            case 3:
                g1.setForeground(null);
                f3.setForeground(getDrawable(R.drawable.piece_6));
                ((TextView) findViewById(R.id.count_check)).setText("+0.40");
                count++;
                break;

            case 4:
                b8.setForeground(null);
                c6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.46");
                break;

            case 5:
                f1.setForeground(null);
                c4.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.60");
                break;

            case 6:
                f8.setForeground(null);
                c5.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.57");
                break;

            case 7:
                c2.setForeground(null);
                c3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.35");
                break;

            case 8:
                g8.setForeground(null);
                f6.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.40");
                break;

            case 9:
                d2.setForeground(null);
                d3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.30");
                break;

            case 10:
                d7.setForeground(null);
                d6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.43");
                break;

            case 11:
                e1.setForeground(null);
                h1.setForeground(null);
                g1.setForeground(getDrawable(R.drawable.piece_11));
                f1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.48");
                break;

            case 12:
                e8.setForeground(null);
                h8.setForeground(null);
                g8.setForeground(getDrawable(R.drawable.piece_12));
                f8.setForeground(getDrawable(R.drawable.piece_3));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.50");
                break;

            case 13:
                c4.setForeground(null);
                b3.setForeground(getDrawable(R.drawable.piece_7));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.12");
                break;

            case 14:
                h7.setForeground(null);
                h6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.30");
                break;

            case 15:
                b1.setForeground(null);
                d2.setForeground(getDrawable(R.drawable.piece_6));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.30");
                break;

            case 16:
                a7.setForeground(null);
                a6.setForeground(getDrawable(R.drawable.piece_1));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.42");
                break;

            case 17:
                h2.setForeground(null);
                h3.setForeground(getDrawable(R.drawable.piece_2));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.33");
                break;

            case 18:
                c5.setForeground(null);
                a7.setForeground(getDrawable(R.drawable.piece_8));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.20");
                break;

            case 19:
                f1.setForeground(null);
                e1.setForeground(getDrawable(R.drawable.piece_4));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.35");
                break;

            case 20:
                f6.setForeground(null);
                h5.setForeground(getDrawable(R.drawable.piece_5));
                count++;
                ((TextView) findViewById(R.id.count_check)).setText("+0.20");
                break;
        }
    }

}