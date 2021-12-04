package com.example.wedietapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LogInActivity extends AppCompatActivity {
    TextView txt_registration;
    EditText ed_username, ed_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_registration = findViewById(R.id.txt_registration);
        txt_registration.setOnClickListener(v -> startActivity(new Intent(LogInActivity.this, RegistrationActivity.class)));

        ed_username = findViewById(R.id.ed_username);
        ed_password = findViewById(R.id.ed_password);
        btn_login = findViewById(R.id.btn_signin);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LogInActivity.this,UserInfoActivity.class));
//                String userID = ed_username.getText().toString();
//                String userPass = ed_password.getText().toString();
//
//                if (userID.equals("")) {
//                    Toast.makeText(LogInActivity.this,
//                            "Please enter your username",
//                            Toast.LENGTH_LONG).show();
//                }
//
//                if (userPass.equals("")) {
//                    Toast.makeText(LogInActivity.this,
//                            "Please enter your password",
//                            Toast.LENGTH_LONG).show();
//                }
//                else{
//                    startActivity(new Intent(LogInActivity.this,MenuActivity.class));
//                }
            }
        });
    }
}