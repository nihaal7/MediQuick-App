package com.mediquick.mediquick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class Screen2 extends AppCompatActivity {
    Button su,si;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
       // b1=findViewById(R.id.button);
       // b2=findViewById(R.id.button3);
       // b1.setVisibility(View.GONE);
       // b2.setVisibility(View.GONE);
        su = (Button)findViewById(R.id.signup);
        si=(Button)findViewById(R.id.button5);
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(getApplicationContext(),Screen3.class);
                startActivity(in);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),Screen2_2.class);
                startActivity(in);
            }
        });
    }
}
