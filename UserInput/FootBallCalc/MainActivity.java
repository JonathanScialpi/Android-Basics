package com.android.roguebot.sportsscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team1TDs =0;
    int team1FGs =0;
    int team1EPs =0;
    int team1Safety =0;
    int team2TDs =0;
    int team2FGs =0;
    int team2EPs =0;
    int team2Safety =0;
    int team1Final=0;
    int team2Final=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
 * Touchdown scores
 */
    public void incTeam1TD(View view) {
        team1TDscore(++team1TDs);
    }

    public void decTeam1TD(View view) {
        team1TDscore(--team1TDs);
    }
    public void incTeam2TD(View view) {
        team2TDscore(++team2TDs);
    }

    public void decTeam2TD(View view) {
        team2TDscore(--team2TDs);
    }

    protected void team1TDscore(int touchdowns){
        TextView  tdScore = (TextView) findViewById(R.id.team1TDscore);
        tdScore.setText(""+touchdowns*7);
    }
    protected void team2TDscore(int touchdowns){
        TextView  tdScore = (TextView) findViewById(R.id.team2TDscore);
        tdScore.setText(""+touchdowns*7);
    }
/**
 * FieldGoal scores
 */
    public void incTeam1FG(View view) {
        team1FGscore(++team1FGs);
    }

    public void decTeam1FG(View view) {
        team1FGscore(--team1FGs);
    }
    public void incTeam2FG(View view) {
        team2FGscore(++team2FGs);
    }

    public void decTeam2FG(View view) {
        team2FGscore(--team2FGs);
    }
    protected void team1FGscore(int fieldGoals){
        TextView  tdScore = (TextView) findViewById(R.id.team1FGscore);
        tdScore.setText(""+fieldGoals*3);
    }
    protected void team2FGscore(int fieldGoals){
        TextView  tdScore = (TextView) findViewById(R.id.team2FGscore);
        tdScore.setText(""+fieldGoals*3);
    }

    /**
     * Extra Point scores
     */
    public void incTeam1EP(View view) {
        team1EPscore(++team1EPs);
    }

    public void decTeam1EP(View view) {
        team1EPscore(--team1EPs);
    }
    public void incTeam2EP(View view) {
        team2EPscore(++team2EPs);
    }

    public void decTeam2EP(View view) {
        team2EPscore(--team2EPs);
    }
    protected void team1EPscore(int extraPoints){
        TextView  tdScore = (TextView) findViewById(R.id.team1EPscore);
        tdScore.setText(""+extraPoints);
    }
    protected void team2EPscore(int extraPoints){
        TextView  tdScore = (TextView) findViewById(R.id.team2EPscore);
        tdScore.setText(""+extraPoints);
    }
    /**
     * Saftey scores
     */
    public void incTeam1S(View view) {
        team1Sscore(++team1Safety);
    }

    public void decTeam1S(View view) {
        team1Sscore(--team1Safety);
    }
    public void incTeam2S(View view) {
        team2Sscore(++team2Safety);
    }

    public void decTeam2S(View view) {
        team2Sscore(--team2Safety);
    }
    protected void team1Sscore(int saftey){
        TextView  tdScore = (TextView) findViewById(R.id.team1Sscore);
        tdScore.setText(""+saftey*2);
    }
    protected void team2Sscore(int saftey){
        TextView  tdScore = (TextView) findViewById(R.id.team2Sscore);
        tdScore.setText(""+saftey*2);
    }

    protected void calcFinalScore(View view){
        TextView  team1 = (TextView) findViewById(R.id.Team1Final);
        int finalScore1 = (team1TDs*7)+(team1FGs*3)+team1EPs+(team1Safety*2);
        team1.setText(""+finalScore1);


        TextView  team2 = (TextView) findViewById(R.id.Team2Final);
        int finalScore2 =(team2TDs*7)+(team2FGs*3)+team2EPs+(team2Safety*2);
        team2.setText(""+finalScore2);
    }

}
