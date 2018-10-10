package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private Button feed, rules;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }
    public void addoneA(View v){
        scoreTeamA = scoreTeamA +1 ;
        displayForTeamA(scoreTeamA);
    }

    public void addoneB(View v){
        scoreTeamB = scoreTeamB +1 ;
        displayForTeamB(scoreTeamB);
    }
    public void addtwoA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void addtwoB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addthreeA(View v){
        scoreTeamA =scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addthreeB(View v){
        scoreTeamB =scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void Reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
