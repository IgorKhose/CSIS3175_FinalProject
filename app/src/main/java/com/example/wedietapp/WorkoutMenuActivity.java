package com.example.wedietapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class WorkoutMenuActivity extends AppCompatActivity {
    CardView cvRain, cvTrain, cvForest;
    GridLayout grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_menu);
        grid = findViewById(R.id.grid);
        cvRain = findViewById(R.id.cvRain);
        cvTrain = findViewById(R.id.cvTrain);
        cvForest = findViewById(R.id.cvForest);


        cvRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkoutMenuActivity.this, YogaActivity.class));
            }
        });
        cvTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkoutMenuActivity.this, LowerBodyBurnoutActivity.class));
            }
        });
        cvForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkoutMenuActivity.this, CrossTrainingActivity.class));
            }
        });
    }
}