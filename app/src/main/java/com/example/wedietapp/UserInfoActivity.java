package com.example.wedietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {
    EditText age, height, weight;
    RadioGroup radGroupWorkouts;
    RadioButton rad5_7, rad3_4, rad1_2, radHaveNotTrained;
    Button btnSubmitInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        age = findViewById(R.id.editTxtAge);
        height = findViewById(R.id.editTxtHeight);
        weight = findViewById(R.id.editTxtWeight);
        radGroupWorkouts = findViewById(R.id.radGroupWorkouts);
        rad5_7 = findViewById(R.id.rad5_7);
        rad3_4 = findViewById(R.id.rad3_4);
        rad1_2 = findViewById(R.id.rad1_2);
        radHaveNotTrained = findViewById(R.id.radHaveNotTrained);
        btnSubmitInfo = findViewById(R.id.btnSubmitInfo);

        radGroupWorkouts.check(rad5_7.getId());

        btnSubmitInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(age.getText().toString().equals("") || Integer.parseInt(age.getText().toString()) < 1 )
                    Toast.makeText(UserInfoActivity.this,"Please enter your age", Toast.LENGTH_SHORT).show();
                else if(height.getText().toString().equals("") || Integer.parseInt(height.getText().toString()) < 1)
                    Toast.makeText(UserInfoActivity.this,"Please enter your height", Toast.LENGTH_SHORT).show();
                else if(weight.getText().toString().equals("") || Integer.parseInt(weight.getText().toString()) < 1)
                    Toast.makeText(UserInfoActivity.this,"Please enter your weight", Toast.LENGTH_SHORT).show();

                else
                    startActivity(new Intent(UserInfoActivity.this,SetGoalActivity.class));
            }
        });

    }
}