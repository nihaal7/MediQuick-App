package com.mediquick.mediquick;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Screen2_2 extends AppCompatActivity {
    EditText pass,user;
    Button b;
    private FirebaseAuth mAuth;
    Intent i;
    DatabaseReference db;
    String id,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2_2);
        pass=findViewById(R.id.editText3);
        user=findViewById(R.id.editText);
        b=findViewById(R.id.button14);
        mAuth = FirebaseAuth.getInstance();
        id="";
        db=FirebaseDatabase.getInstance().getReference("Users");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                    username=user.getText().toString();
                    password=pass.getText().toString();
                     db.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot ds :dataSnapshot.getChildren())
                        {
                            Person p=new Person();
                            p=ds.getValue(Person.class);
                            if (p.email.equals(username))
                            id=ds.getKey();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                    mAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful())
                            {

                                Toast.makeText(v.getContext(),id,Toast.LENGTH_LONG);
                                i=new Intent(v.getContext(),Screen5.class);
                                i.putExtra("id",id);
                                startActivity(i);
                            }
                                else
                            Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }                    });


            }
        });
    }
}
