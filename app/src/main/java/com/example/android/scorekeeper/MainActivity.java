package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String STR_TEAM_A = "a";
    private final String STR_TEAM_B = "b";
    private int scoreTeamA = 0; //creates global variable to store each team's respective score
    private int scoreTeamB = 0;
    private TextView team_A_score;
    private TextView team_B_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_A_score = findViewById(R.id.team_A_score); // declare team_A_score as textView, which we identify using findViewById
        team_B_score = findViewById(R.id.team_B_score);
    }

    public void addPoints(View v) { // this method determines which button called the method so we know how many points to add to the score.
        switch (v.getId()) { // gets the id of the view that called the method.
            // team A
            case R.id.buttonTeamAplus6: //touchdown button pressed
                scoreTeamA += 6; //add 6 to scoreTeamA global variable
                displayPoints(scoreTeamA, STR_TEAM_A); //pass the updated score and respective team to the displayPoints method below.
                break;
            case R.id.buttonTeamAplus3:
                scoreTeamA += 3;
                displayPoints(scoreTeamA, STR_TEAM_A);
                break;
            case R.id.buttonTeamAplus2:
                scoreTeamA += 2;
                displayPoints(scoreTeamA, STR_TEAM_A);
                break;
            case R.id.buttonTeamAExtraPoint:
                scoreTeamA += 1;
                displayPoints(scoreTeamA, STR_TEAM_A);
                break;
            // team B
            case R.id.buttonTeamBplus6:
                scoreTeamB += 6;
                displayPoints(scoreTeamB, STR_TEAM_B);
                break;
            case R.id.buttonTeamBplus3:
                scoreTeamB += 3;
                displayPoints(scoreTeamB, STR_TEAM_B);
                break;
            case R.id.buttonTeamBplus2:
                scoreTeamB += 2;
                displayPoints(scoreTeamB, STR_TEAM_B);
                break;
            case R.id.buttonTeamBExtraPoint:
                scoreTeamB += 1;
                displayPoints(scoreTeamB, STR_TEAM_B);
                break;
        }
    }

    public void displayPoints(int score, String team) { //this method accepts two parameters - the first being the score to add, and the second being the team to add it to.
        switch (team.toLowerCase()) { //update the score so the user can actually see it -- as the user won't be able to see the global variable.
            case "a": // if team a called this section
                team_A_score.setText(String.valueOf(score)); //set the text of team A to the int score, passed on from addPoints method earlier.
                break;
            case "b":
                team_B_score.setText(String.valueOf(score));
                break;
        }
    }

    public void resetCounter(View v) { // resets both the global variable and displays the new score of 0 for the user to see.
        scoreTeamA = 0; // Resets the global variable score counter back to zero.
        scoreTeamB = 0;
        displayPoints(0, STR_TEAM_A); // Resets the TextViews back to zero.
        displayPoints(0, STR_TEAM_B);
    }
}
