package com.example.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantityA =0;
    int quantityB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(quantityA);
        displayForTeamB(quantityB);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
   public void threePointsA(View view){
        quantityA = quantityA+3;
        displayForTeamA(quantityA);
   }
    public void twoPointsA(View view){
       quantityA = quantityA +2;
        displayForTeamA(quantityA);
    }
    public void FreeThrowA(View view){
        quantityA = quantityA+1;
        displayForTeamA(quantityA);
    }

    public void threePointsB(View view){
        quantityB = quantityB+3;
        displayForTeamB(quantityB);
    }
    public void twoPointsB(View view){
        quantityB = quantityB+2;
        displayForTeamB(quantityB);
    }
    public void FreeThrownB(View view){
        quantityB = quantityB +1;
        displayForTeamB(quantityB);
    }

    public void resetCode(View view){
        displayForTeamA(0);
        displayForTeamB(0);
        quantityB=0;
        quantityA=0;
    }
}