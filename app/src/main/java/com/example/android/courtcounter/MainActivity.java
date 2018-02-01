package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void resetCounter(View v) {
        scoreTeamA = 0; // Resets the actual score counter back to zero. Resetting this will change the value of the score variable, but will not actually reset the textviews.
        scoreTeamB = 0;
        displayForTeamA(0); // Sets the TextViews to 0 to so the variable and textview remain the same.
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView team_A_score = (TextView) findViewById(R.id.team_A_score);
        team_A_score.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView team_B_score = (TextView) findViewById(R.id.team_B_score);
        team_B_score.setText(String.valueOf(score));
    }

    public void threePointsA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void onePointA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void onePointB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

}
