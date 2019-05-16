package com.example.sql;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pop extends AppCompatActivity {

    EditText etReset;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);

        etReset= (EditText)findViewById(R.id.etReset);
        btnSend= (Button) findViewById(R.id.btnSend);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etReset.getText().toString().isEmpty()){
                    Toast.makeText(Pop.this, "Please enter your email address", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });


    }

}
