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
    private Button createAccount;
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);


        createAccount = findViewById(R.id.createAccount);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewAccountActivity();
            }
        });
        logIn = findViewById(R.id.logIn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }


    public void openNewAccountActivity() {
        Intent intent = new Intent(LoginActivity.this, NewAccountActivity.class);
        startActivity(intent);

    }
    public void openMainActivity() {
        Intent intent2 = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent2);

    }






}
