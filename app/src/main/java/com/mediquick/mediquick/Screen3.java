package com.mediquick.mediquick;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

class Person
{
    String email,name,address,age,sex,history;

    public Person(String email, String name, String address, String age, String sex,String history) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.history=history;
    }

    public Person() {
    }
}


public class Screen3 extends AppCompatActivity {
    CheckBox cb;
    TextView user,pass,namev,addrv,agev,sexv;
    String username,password,name,addr,age,sex;
    FirebaseAuth mAuth;
    Intent i1,i2,i3;
    DatabaseReference db;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        cb= (CheckBox)findViewById(R.id.checkBox);
        Button su=findViewById(R.id.button6);
        user=findViewById(R.id.editText5);
        pass=findViewById(R.id.editText2);
        namev=findViewById(R.id.editText4);
        addrv=findViewById(R.id.editText7);
        agev=findViewById(R.id.editText6);
        sexv=findViewById(R.id.editText8);
        mAuth=FirebaseAuth.getInstance();
        db=FirebaseDatabase.getInstance().getReference("Users");


        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1 = new Intent(v.getContext(), Screen4.class);
                i2 = new Intent(v.getContext(), Screen5.class);
                i3 = new Intent(v.getContext(), Screen5_2.class);
                username=user.getText().toString();
                password=pass.getText().toString();
                name=namev.getText().toString();
                addr=addrv.getText().toString();
                age=agev.getText().toString();
                sex=sexv.getText().toString();

                mAuth.createUserWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            String id=  db.push().getKey();
                            Person p= new Person(username,name,addr,age,sex,"");
                            db.child(id).setValue(p);
                            i1.putExtra("id",id);
                            i3.putExtra("id",id);
                            if(cb.isChecked())
                                startActivity(i1);
                            else
                                startActivity(i2);

                        }
                        else
                            Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }
}
