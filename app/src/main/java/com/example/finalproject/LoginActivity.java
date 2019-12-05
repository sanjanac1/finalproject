package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
//import com.example.finalproject.;


/** Login Screen Activity and creating new user account */
public class LoginActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);


        username = findViewById(R.id.userName);
        password = findViewById(R.id.passWord);
        login = findViewById(R.id.loginButton);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(), password.getText().toString());

            }
        });

    }

    private void validate(String user, String pass) {
        if (user.equals("Sanjana") && pass.equals("Shivani")) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            setContentView(R.layout.calendar);
        }


    }
}
