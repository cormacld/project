package com.example.sql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText etName,etSurname, etEmail,etUsername,etPassword,etReenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName=(EditText) findViewById(R.id.etName);
        etSurname=(EditText) findViewById(R.id.etSurname);
        etEmail =(EditText) findViewById(R.id.etEmail);
        etUsername=(EditText) findViewById(R.id.etUsername);
        etPassword=(EditText) findViewById(R.id.etPassword);
        etReenter=(EditText) findViewById(R.id.etReenter);


    }


    public void OnReg(View view){
        if(etName.getText().toString().isEmpty()||etSurname.getText().toString().isEmpty()
                || etEmail.getText().toString().isEmpty()||etUsername.getText().toString().isEmpty()
                || etPassword.getText().toString().isEmpty()||etReenter.getText().toString().isEmpty()){

                     Toast.makeText(Register.this,"Please enter all details",Toast.LENGTH_SHORT).show();
        } else {
            if(etPassword.getText().toString().trim().equals(etReenter.getText().toString().trim())==false){
                Toast.makeText(Register.this,"Please ensure passwords match",Toast.LENGTH_SHORT).show();
            }
            else {

                String str_name = etName.getText().toString();
                String str_surname = etSurname.getText().toString();
                String str_email = etEmail.getText().toString();
                String str_username = etUsername.getText().toString();
                String str_password = etPassword.getText().toString();


                String type = "register";

                BackgroundWorker backgroundWorker = new BackgroundWorker(this);
                backgroundWorker.execute(type, str_name, str_surname, str_email, str_username, str_password);


            }
        }

        }

    }

