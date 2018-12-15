package com.mediquick.mediquick;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.CheckBox;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Screen4 extends AppCompatActivity {
    Button b;
    String id;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27;
    String his;
    FirebaseAuth mAuth;
    DatabaseReference db;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        mAuth=FirebaseAuth.getInstance();
        db=FirebaseDatabase.getInstance().getReference("Users");
        b=findViewById(R.id.button4);
        id=getIntent().getStringExtra("id");
        his="";
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cb1=findViewById(R.id.i1);
                if (cb1.isChecked())
                    his=his+"Acidity ";
                cb2=findViewById(R.id.i2);
                if (cb2.isChecked())
                    his=his+"Alzheimer's Disease ";
                cb3=findViewById(R.id.i3);
                if (cb3.isChecked())
                    his=his+"Arthritis ";
                cb4=findViewById(R.id.i4);
                if (cb4.isChecked())
                    his=his+"Asthma";
                cb5=findViewById(R.id.i5);
                if (cb5.isChecked())
                    his=his+"Blood Cancer ";
                cb6=findViewById(R.id.i6);
                if (cb6.isChecked())
                    his=his+"Bone Cancer ";
                cb7=findViewById(R.id.i7);
                if (cb7.isChecked())
                    his=his+"Brain Tumour ";
                cb8=findViewById(R.id.i8);
                if (cb8.isChecked())
                    his=his+"Bronchitis ";
                cb9=findViewById(R.id.i9);
                if (cb9.isChecked())
                    his=his+"Chicken Pox ";
                cb10=findViewById(R.id.i10);
                if (cb10.isChecked())
                    his=his+"Cirrhosis ";
                cb11=findViewById(R.id.i11);
                if (cb11.isChecked())
                    his=his+"Conjunctivitis ";
                cb12=findViewById(R.id.i12);
                if (cb12.isChecked())
                    his=his+"Diabetes Type 1 ";
                cb13=findViewById(R.id.i13);
                if (cb13.isChecked())
                    his=his+"Diabetes Type 2 ";
                cb14=findViewById(R.id.i14);
                if (cb14.isChecked())
                    his=his+"Dyslexia ";
                cb15=findViewById(R.id.i15);
                if (cb15.isChecked())
                    his=his+"Gout ";
                cb16=findViewById(R.id.i16);
                if (cb16.isChecked())
                    his=his+"Haemorrhoids ";
                cb17=findViewById(R.id.i17);
                if (cb17.isChecked())
                    his=his+"Hepatitis A ";
                cb18=findViewById(R.id.i18);
                if (cb18.isChecked())
                    his=his+"Hepatitis B  ";
                cb19=findViewById(R.id.i19);
                if (cb19.isChecked())
                    his=his+"Hyperlipidemia ";
                cb20=findViewById(R.id.i20);
                if (cb20.isChecked())
                    his=his+"HIV ";
                cb21=findViewById(R.id.i21);
                if (cb21.isChecked())
                    his=his+"Kidney Stones ";
                cb22=findViewById(R.id.i22);
                if (cb22.isChecked())
                    his=his+"Leukemia ";
                cb23=findViewById(R.id.i23);
                if (cb23.isChecked())
                    his=his+"Lung Cance ";
                cb24=findViewById(R.id.i24);
                if (cb24.isChecked())
                    his=his+"Malaria ";
                cb25=findViewById(R.id.i25);
                if (cb25.isChecked())
                    his=his+"Parkinson's Disease ";
                cb26=findViewById(R.id.i26);
                if (cb26.isChecked())
                    his=his+"Tuberculosis ";
                cb27=findViewById(R.id.i27);
                if (cb27.isChecked())
                    his=his+"Vertigo ";
                        db.child(id).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            dataSnapshot.getRef().child("history").setValue(his);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });

                Intent i= new Intent(v.getContext(), Screen5.class);
                i.putExtra("id",id);
                startActivity(i);
            }
        });
    }
}
