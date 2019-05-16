package com.example.sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Panel extends AppCompatActivity implements PlayerAdapter.ItemClicked {

    TextView etPlayerName, etPlayerTel, etPlayerEmail;
    Button btnPlayerAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        etPlayerName= findViewById(R.id.etPlayerName);
        etPlayerTel=findViewById(R.id.etPlayerTel);
        etPlayerEmail=findViewById(R.id.etPlayerEmail);
        btnPlayerAdd=findViewById(R.id.etPlayerAdd);


    }

    /**
     * Need to do something like this for the posting to the database
     * @param index
     */
    @Override
    public void onItemClicked(int index) {


    }
    public void OnAdd(View view){
        if(etPlayerName.getText().toString().isEmpty()||etPlayerTel.getText().toString().isEmpty()
                || etPlayerEmail.getText().toString().isEmpty()){

            Toast.makeText(Panel.this,"Please enter all details",Toast.LENGTH_SHORT).show();
        }
            else {

                String str_name = etPlayerName.getText().toString();
                String str_phone = etPlayerTel.getText().toString();
                String str_email = etPlayerEmail.getText().toString();



                String type = "addplayer";

                BackgroundWorker backgroundWorker = new BackgroundWorker(this);
                backgroundWorker.execute(type, str_name, str_phone, str_email);


            }
        }


}
