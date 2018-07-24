package com.example.tanya.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    private TextView name,email,pass,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        Intent intent=getIntent();
        String sname=intent.getStringExtra("name");
        String semail=intent.getStringExtra("email");
        String sgender=intent.getStringExtra("gender");
        String spass=intent.getStringExtra("password");
        name=(TextView) findViewById(R.id.name);
        email=(TextView) findViewById(R.id.email);
        pass=(TextView) findViewById(R.id.pass);
        gender=(TextView) findViewById(R.id.gender);
        name.setText(sname);
        email.setText(semail);
        pass.setText(spass);
        gender.setText(sgender);





    }
}
