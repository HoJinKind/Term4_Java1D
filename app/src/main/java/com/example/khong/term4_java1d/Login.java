package com.example.khong.term4_java1d;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    TextView textViewLogin;
    TextView textViewRegister;
    EditText editTextUsername;
    EditText editTextUserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editTextUserName);
        editTextUserPassword = findViewById(R.id.editTextUserPassword);

        //TODO 1: Login button to main activity
        textViewLogin = findViewById(R.id.textViewLogin);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editTextUsername.getText().toString();
                String password = editTextUserPassword.getText().toString();
                // TODO 1.1 for Tim: check whether the information is correct
                if (userName == "Pengfei" && password == "1234") {
                    // TODO 1.2 for Pengfei: link this to the new intent -- activity main
                }
            }
        });

        // TODO 2: register Button to register
        textViewRegister = findViewById(R.id.textViewRegister);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO 2.1 for Pengfei; link this to register
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
