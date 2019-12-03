package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hi", "ok");
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
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            setContentView(R.layout.home);
        }
    }






}



