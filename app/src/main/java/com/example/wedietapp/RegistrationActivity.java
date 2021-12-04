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

public class RegistrationActivity extends AppCompatActivity {

    EditText Fname, Lname, email, password;
    RadioGroup radioGroup;
    RadioButton female, male;
    Button submitform;
    String fName,lName,Email;
    String Paswords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Fname = findViewById(R.id.editTextName);
        Lname = findViewById(R.id.editTextLname);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextNumberPassword);
        radioGroup = findViewById(R.id.radioGroup);
        female = findViewById(R.id.radioFemale);
        male = findViewById(R.id.radioMale);
        submitform = findViewById(R.id.submitBttn);

        submitform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fName = Fname.getText().toString();
                lName = Lname.getText().toString();
                Email = email.getText().toString();
                Paswords = password.getText().toString();


                if (fName.isEmpty()){

                    Toast.makeText(RegistrationActivity.this,"the First Name is required",Toast.LENGTH_LONG).show();
                }
                else if (lName.isEmpty()){
                    Toast.makeText(RegistrationActivity.this,"the Last Name is required",Toast.LENGTH_LONG).show();
                }
                else if (Email.isEmpty()){
                    Toast.makeText(RegistrationActivity.this,"the email is required",Toast.LENGTH_LONG).show();
                }
                else if (Paswords.isEmpty()){
                    Toast.makeText(RegistrationActivity.this,"the password must be at lest 8 digits",Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(new Intent(RegistrationActivity.this,LogInActivity.class ));
                }





            }
        });

    }
}