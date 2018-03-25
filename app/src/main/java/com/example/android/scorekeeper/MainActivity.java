package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0; //creates global variable to store each team's respective score
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPoints(View v) { // this method determines which button called the method so we know how many points to add to the score.
        switch (v.getId()) { // gets the id of the view that called the method.
            // team A
            case R.id.buttonTeamAplus6: //touchdown button pressed
                scoreTeamA += 6; //add 6 to scoreTeamA global variable
                displayPoints(scoreTeamA, "a"); //pass the updated score and respective team to the displayPoints method below.
                break;
            case R.id.buttonTeamAplus3:
                scoreTeamA += 3;
                displayPoints(scoreTeamA, "a");
                break;
            case R.id.buttonTeamAplus2:
                scoreTeamA += 2;
                displayPoints(scoreTeamA, "a");
                break;
            case R.id.buttonTeamAExtraPoint:
                scoreTeamA += 1;
                displayPoints(scoreTeamA, "a");
                break;

            // team B
            case R.id.buttonTeamBplus6:
                scoreTeamB += 6;
                displayPoints(scoreTeamB, "b");
                break;
            case R.id.buttonTeamBplus3:
                scoreTeamB += 3;
                displayPoints(scoreTeamB, "b");
                break;
            case R.id.buttonTeamBplus2:
                scoreTeamB += 2;
                displayPoints(scoreTeamB, "b");
                break;
            case R.id.buttonTeamBExtraPoint:
                scoreTeamB += 1;
                displayPoints(scoreTeamB, "b");
                break;
        }
    }

    public void displayPoints(int score, String team) { //this method accepts two parameters - the first being the score to add, and the second being the team to add it to.
        TextView team_A_score = (TextView) findViewById(R.id.team_A_score); // declare team_A_score as textView, which we identify using findViewById
        TextView team_B_score = (TextView) findViewById(R.id.team_B_score);

        switch (team) { //update the score so the user can actually see it -- as the user won't be able to see the global variable.
            case "a": // if team a called this method
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
        displayPoints(0, "a"); // Resets the TextViews back to zero.
        displayPoints(0, "b");
    }
}
