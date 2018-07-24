package com.example.tanya.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Registration_form extends AppCompatActivity {
    Button b;
    EditText etname;
    EditText etpass;
    EditText etemail;
    RadioButton r1;
    RadioButton r2;
    RadioGroup rg;
    String salute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
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
        b=(Button)findViewById(R.id.b1);
        etname=(EditText)findViewById(R.id.input_name);
        etpass=(EditText)findViewById(R.id.text_input_password);
        r1=(RadioButton) findViewById(R.id.f);
        r2=(RadioButton)findViewById(R.id.m);
        rg=(RadioGroup)findViewById(R.id.rG);



etemail=(EditText)findViewById(R.id.input_email);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if(r1.isChecked())
            {
              salute ="Ms";
               }
                else
               {
                  salute="Mr";
               }
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)rg.findViewById(i);
                final String name=etname.getText().toString();
                final String email=etemail.getText().toString();
                final String pass=etpass.getText().toString();
                Toast.makeText(Registration_form.this, "name "+ salute+"."+ name + " \n email "+ email + "\n password "+pass +"\n gender "+rb.getText().toString(), Toast.LENGTH_SHORT).show();
          //      System.out.println("name "+ salute+". "+ name + " \n email "+ email + "\n password " + pass);

                        Intent intent=new Intent(Registration_form.this,activity2.class);


        intent.putExtra("name",etname.getText().toString());
        intent.putExtra("gender",salute);
        intent.putExtra("email",etemail.getText().toString());
        intent.putExtra("password",etpass.getText().toString());
        startActivity(intent);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
