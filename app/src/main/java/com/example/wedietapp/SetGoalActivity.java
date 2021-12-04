package com.example.wedietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class SetGoalActivity extends AppCompatActivity {
    Spinner weekGroup, goalGroup;
    EditText trainingDays;
    RadioGroup radGroupEatingHabits;
    RadioButton rad2times, rad3times, rad6times;
    Button btnSetGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_goals);

        weekGroup = findViewById(R.id.txtWeekGroup);
        goalGroup = findViewById(R.id.txtGoalsGroup);
        trainingDays = findViewById(R.id.editTxtTrainigDays);
        radGroupEatingHabits = findViewById(R.id.radGroupEatingHabits);
        rad2times = findViewById(R.id.rad2times);
        rad3times = findViewById(R.id.rad3times);
        rad6times = findViewById(R.id.rad6times);
        btnSetGoal = findViewById(R.id.btnSetGoal);

        radGroupEatingHabits.check(rad3times.getId());

        btnSetGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trainingDays.getText().toString().equals("") || Integer.parseInt(trainingDays.getText().toString()) < 1)
                    Toast.makeText(SetGoalActivity.this, "Please indicate how many days per week you plan to workout", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SetGoalActivity.this, "Thank you, the information has been submitted", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(SetGoalActivity.this, WorkoutMenuActivity.class));
            }
        });
    }
}