package com.mediquick.mediquick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Diseases
{
    String name,remedy;
    int symptoms[],hits;
    Diseases(String name,List<String>s1)
    {
        this.name=name;
        hits=0;
        remedy="";
        symptoms= new int[20];
        if ((s1.contains("Abdominal Pain")))
            symptoms[1]=1;
        if ((s1.contains("Back Pain")))
            symptoms[2]=1;
        if ((s1.contains("Chills")))
            symptoms[3]=1;
        if ((s1.contains("Dizzy")))
            symptoms[4]=1;
        if ((s1.contains("Dry Mouth")))
            symptoms[5]=1;
        if ((s1.contains("Earache")))
            symptoms[6]=1;
        if ((s1.contains("Fever")))
            symptoms[7]=1;
        if ((s1.contains("Headache")))
            symptoms[8]=1;
        if ((s1.contains("LightHeaded")))
            symptoms[9]=1;
        if ((s1.contains("Nauseated")))
            symptoms[10]=1;
        if ((s1.contains("Pelvic Pain")))
            symptoms[11]=1;
        if ((s1.contains("Rectal Pain")))
            symptoms[12]=1;
        if ((s1.contains("Short of Breath")))
            symptoms[13]=1;
        if ((s1.contains("Toothache")))
            symptoms[14]=1;
        if ((s1.contains("Vaginal Pain")))
            symptoms[15]=1;
        if ((s1.contains("Weakness")))
            symptoms[16]=1;


    }
}


public class Screen8 extends AppCompatActivity {
Button b;
int symp[],max,max_hits;
TextView t;
Diseases d[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);
        symp=getIntent().getIntArrayExtra("Hello");
        t=findViewById(R.id.textView10);
        d=new Diseases[25];
        d[1]=new Diseases("Anemia",new ArrayList<String>(Arrays.asList("Weakness")));
        d[2]=new Diseases("Appendicitis",new ArrayList<String>(Arrays.asList("Nauseated")));
        d[3]=new Diseases("Arthritis",new ArrayList<String>(Arrays.asList("Back Pain")));
        d[4]=new Diseases("Asthma",new ArrayList<String>(Arrays.asList("Short of Breath")));
        d[5]=new Diseases("Brain Tumour",new ArrayList<String>(Arrays.asList("Headache")));
        d[6]=new Diseases("Cold & Flu",new ArrayList<String>(Arrays.asList("Chills","Fever","LightHeaded","Weakness")));
        d[7]=new Diseases("Dehydration",new ArrayList<String>(Arrays.asList("Headache","LightHeaded")));
        d[8]=new Diseases("Ear Wax Blockage",new ArrayList<String>(Arrays.asList("Earache")));
        d[9]=new Diseases("Food Poisoning",new ArrayList<String>(Arrays.asList("Abdominal Pain","Nauseated")));
        d[10]=new Diseases("Gonorrhea",new ArrayList<String>(Arrays.asList("Vaginal Pain")));
        d[11]=new Diseases("Heart attack",new ArrayList<String>(Arrays.asList("Short of Breath")));
        d[12]=new Diseases("Hemorrhoids",new ArrayList<String>(Arrays.asList("Pelvic Pain,Rectal Pain")));
        d[13]=new Diseases("Hepatitis",new ArrayList<String>(Arrays.asList("Nauseated")));
        d[14]=new Diseases("High Blood Pressure",new ArrayList<String>(Arrays.asList("Dizzy")));
        d[15]=new Diseases("Irritable Bowel Syndrome",new ArrayList<String>(Arrays.asList("Abdominal Pain, Pelvic Pain")));
        d[16]=new Diseases("Kidney Stones",new ArrayList<String>(Arrays.asList("Back Pain")));
        d[17]=new Diseases("Low Blood Sugar",new ArrayList<String>(Arrays.asList("Dizzy","LightHeaded")));
        d[18]=new Diseases("Outer Ear Infection",new ArrayList<String>(Arrays.asList("Earache")));
        d[19]=new Diseases("Pulpitis",new ArrayList<String>(Arrays.asList("Toothache")));
        d[20]=new Diseases("Stomach Ulcer",new ArrayList<String>(Arrays.asList("Nauseated")));
        d[21]=new Diseases("Tonsillitis",new ArrayList<String>(Arrays.asList("Chills")));
        d[22]=new Diseases("Tooth Decay",new ArrayList<String>(Arrays.asList("Toothache")));
        d[23]=new Diseases("Urinary Tract Infection",new ArrayList<String>(Arrays.asList("Abdominal Pain")));
        for (int i=1;i<=23;i++)
        {
            for (int j=1;j<=16;j++)
            {
                if(d[i].symptoms[j]==symp[j])
                    d[i].hits++;
            }
            if (d[i].hits>max_hits)
            {
                max=i;
                max_hits=d[i].hits;
            }

        }
        t.append(d[max].name);
        b=findViewById(R.id.button12);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),Screen9.class);
                i.putExtra("Disease",d[max].name);
                startActivity(i);
            }
        });
    }
}
