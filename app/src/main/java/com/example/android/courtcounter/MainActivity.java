package com.example.android.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button game, courts, nba, rules, feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = (Button) findViewById(R.id.score);
        courts = (Button) findViewById(R.id.courts);
        rules = (Button) findViewById(R.id.rules);
        feedback = (Button) findViewById(R.id.feedback);
        nba = (Button) findViewById(R.id.nba);

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ScoreActivity.class);
                startActivity(in);
            }
        });

        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, RulesActivity.class);
                startActivity(in);
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, FeedbackActivity.class);
                startActivity(in);
            }
        });

        nba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, NBAActivity.class);
                startActivity(in);
            }
        });

        courts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, CourtsActivity.class);
                startActivity(in);
            }
        });
    }
}
