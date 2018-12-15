package com.mediquick.mediquick;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.TextView;



import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Screen5_2 extends AppCompatActivity {
    FirebaseAuth mAuth;
    DatabaseReference db;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5_2);
        final String id=getIntent().getStringExtra("id");
        mAuth=FirebaseAuth.getInstance();
        db=FirebaseDatabase.getInstance().getReference("Users");
        t=findViewById(R.id.textView12);
          db.child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Person p=dataSnapshot.getValue(Person.class);
                t.append("Name: "+p.name);
                t.append("\nAge: "+p.age);
                t.append("\nSex: "+ p.sex);
                t.append("\n\nMedical History:\n"+p.history);
            }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
});
    }
}
