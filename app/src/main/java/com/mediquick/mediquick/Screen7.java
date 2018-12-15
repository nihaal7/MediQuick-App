package com.mediquick.mediquick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.CheckBox;


public class Screen7 extends AppCompatActivity {
    Button b;
    CheckBox C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16;
    int sym[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);
        sym=new int[17];
        C1=findViewById(R.id.cb1);
        C2=findViewById(R.id.cb2);
        C3=findViewById(R.id.cb3);
        C4=findViewById(R.id.cb4);
        C5=findViewById(R.id.cb5);
        C6=findViewById(R.id.cb6);
        C7=findViewById(R.id.cb7);
        C8=findViewById(R.id.cb8);
        C9=findViewById(R.id.cb9);
        C10=findViewById(R.id.cb10);
        C11=findViewById(R.id.cb11);
        C12=findViewById(R.id.cb12);
        C13=findViewById(R.id.cb13);
        C14=findViewById(R.id.cb14);
        C15=findViewById(R.id.cb15);
        C16=findViewById(R.id.cb16);
        b=findViewById(R.id.button11);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (C1.isChecked())
                    sym[1]=1;
                if (C2.isChecked())
                    sym[2]=1;
                if (C3.isChecked())
                    sym[3]=1;
                if (C4.isChecked())
                    sym[4]=1;
                if (C5.isChecked())
                    sym[5]=1;
                if (C6.isChecked())
                    sym[6]=1;
                if (C7.isChecked())
                    sym[7]=1;
                if (C8.isChecked())
                    sym[8]=1;
                if (C9.isChecked())
                    sym[9]=1;
                if (C10.isChecked())
                    sym[10]=1;
                if (C11.isChecked())
                    sym[11]=1;
                if (C12.isChecked())
                    sym[12]=1;
                if (C13.isChecked())
                    sym[13]=1;
                if (C14.isChecked())
                    sym[14]=1;
                if (C15.isChecked())
                    sym[15]=1;
                if (C16.isChecked())
                    sym[16]=1;
                Intent i= new Intent(v.getContext(),Screen8.class);
                i.putExtra("Hello",sym);
                startActivity(i);
            }
        });

    }
}
