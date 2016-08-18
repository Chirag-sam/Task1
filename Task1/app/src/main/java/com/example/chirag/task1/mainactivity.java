package com.example.chirag.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mainactivity extends AppCompatActivity {
     Button validate;
    public static EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        Button validate=(Button)findViewById(R.id.validate);
        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText email=(EditText)findViewById(R.id.email);
                String e = email.getText().toString().trim();
                String emailPattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
                if(e.length()==0)
                {

                            Toast.makeText(mainactivity.this, "Empty!!!", Toast.LENGTH_LONG).show();
                }
                else if(e.length()>0 && e.matches(emailPattern))
                {

                            Toast.makeText(mainactivity.this, "Email is valid", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(mainactivity.this,secondactivity.class);
                    String userMessage = email.getText().toString();
                    i.putExtra("data",userMessage);

                    startActivity(i);

                }
                else
                {
                    Toast.makeText(mainactivity.this, "Email is not valid!!", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
    @Override
    public void onResume(){
        super.onResume();
        EditText email=(EditText)findViewById(R.id.email);
        email.setText("");

    }

}
