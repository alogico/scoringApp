package com.example.scoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA_score = 0, teamB_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void button3_TeamA(View view) {
        teamA_score += 3;
        displayForTeamA(teamA_score);
    }

    public void button2_TeamA(View view) {
        teamA_score += 2;
        displayForTeamA(teamA_score);
    }

    public void button1_TeamA(View view) {
        teamA_score += 1;
        displayForTeamA(teamA_score);
    }

    /*
     * this method displays the score
     */
    public void displayForTeamA(int scoreA) {
        TextView show = findViewById(R.id.score_team_A);
        show.setText(String.valueOf(scoreA));
    }


    public void button3_TeamB(View view) {
        teamB_score += 3;
        displayForTeamB(teamB_score);
    }

    public void button2_TeamB(View view) {
        teamB_score += 2;
        displayForTeamB(teamB_score);
    }

    public void button1_TeamB(View view) {
        teamB_score += 1;
        displayForTeamB(teamB_score);
    }

    /*
     * this method displays the score
     */
    public void displayForTeamB(int scoreB) {
        TextView show = findViewById(R.id.score_team_B);
        show.setText(String.valueOf(scoreB));
    }

    public void reset(View view) {
        teamA_score = 0;
        teamB_score = 0;
        displayForTeamA(teamA_score);
        displayForTeamB(teamB_score);
    }
}
