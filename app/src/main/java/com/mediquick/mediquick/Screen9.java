package com.mediquick.mediquick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Screen9 extends AppCompatActivity {

    TextView T;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);
        s=getIntent().getStringExtra("Disease");
        T=findViewById(R.id.textView9);
        if (s.equals("Anemia"))
            T.append("Depending on the type of Anemia, you may want to take appropiate supplements ");
        if (s.equals("Appendicitis"))
            T.append("Appendicitis is a medical emergency that almost always requires prompt surgery to remove the appendix. Left untreated, an inflamed appendix will eventually burst, or perforate, spilling infectious materials into the abdominal cavity. This can lead to peritonitis, a serious inflammation of the abdominal cavity's lining (the peritoneum) that can be fatal unless it is treated quickly with strong antibiotics.");
        if (s.equals("Arthritis"))
            T.append("The medications used to treat arthritis vary depending on the type of arthritis. Commonly used arthritis medications include: \nAnalgesics\n NSAIDs\n Counterirritants\n DMARDs\n Biologic response modifiers\n Corticosteroids");
        if (s.equals("Asthma"))
            T.append("If you are having an asthma attack, 1. Sit upright \n2. Take long, deep breaths\n3.Stay calm\n4.Get away from the trigger\n5.Take a hot caffeinated beverage.");
        if (s.equals("Brain Tumour"))
            T.append("Seek Medical Help Immediately!!");
        if (s.equals("Cold & Flu"))
            T.append("Use over-the-counter cold medications to relieve symptoms including sore throat, runny nose, congestion, and cough. Flu symptoms are similar, but include fever, headache and muscle soreness. See a doctor who may prescribe antiviral medications Relenza or Tamiflu.");
        if (s.equals("Dehydration"))
            T.append("Sip small amounts of water.\n" +
                    "Drink carbohydrate/electrolyte-containing drinks. Good choices are sports drinks such as Gatorade or prepared replacement solutions (Pedialyte is one example).\n" +
                    "Suck on popsicles made from juices and sports drinks.\n" +
                    "Suck on ice chips.");
        if (s.equals("Ear Wax Blockage"))
            T.append("Soften the wax. Use an eyedropper to apply a few drops of baby oil, mineral oil, glycerin or hydrogen peroxide in your ear canal.\n" +
                    "Use warm water. After a day or two, when the wax is softened, use a rubber-bulb syringe to gently squirt warm water into your ear canal. Tilt your head and pull your outer ear up and back to straighten your ear canal. When finished irrigating, tip your head to the side to let the water drain out.\n" +
                    "Dry your ear canal. When finished, gently dry your outer ear with a towel or hand-held dryer.");
        if (s.equals("Food Poisoning"))
            T.append("If you have food poisoning, it’s crucial to remain properly hydrated. Sports drinks high in electrolytes can be helpful with this. Fruit juice and coconut water can restore carbohydrates and help with fatigue.\n" +
                    "\n" +
                    "Avoid caffeine, which may irritate the digestive tract. Decaffeinated teas with soothing herbs like chamomile, peppermint, and dandelion may calm an upset stomach. Read about more remedies for an upset stomach.\n" +
                    "\n" +
                    "Over-the-counter medications like Imodium and Pepto-Bismol can help control diarrhea and suppress nausea. \n" +
                    "\n" +
                    "It’s also important for those with food poisoning to get plenty of rest.");
        if (s.equals("Gonorrhea"))
            T.append("If you have this STD, your doctor will likely prescribe two antibiotics: ceftriaxone and either azithromycin (Zithromax, Zmax) or doxycycline (Monodox, Vibramycin).\n" +
                    "\n" +
                    "Ceftriaxone is given as a one-time injection -- usually a dose of 250 milligrams (mg). The other two antibiotics are taken by mouth.");
        if (s.equals("Heart attack"))
            T.append("Call an ambulance immediately!!");
        if (s.equals("Hemorrhoids"))
            T.append("•\tEat high-fiber foods. \n" +
                    "•\tUse topical treatments. \n" +
                    "•\tSoak regularly in a warm bath or sitz bath. \n" +
                    "•\t Keep the anal area clean. .\n" +
                    "•\tDon't use dry toilet paper. \n" +
                    "•\t Apply cold. \n" +
                    "•\tTake oral pain relievers.  \n");
        if (s.equals("Hepatitis"))
            T.append("Meet a Doctor. He/She will prescribe anti-viral medications");
        if (s.equals("High Blood Pressure"))
            T.append("1.Get moving\n2.Reduce Salt\n3.Lose Weight\n4.Stop Smoking\n5.Limit Alcohol");
        if (s.equals("Irritable Bowel Syndrome"))
            T.append("•\tAvoid foods that trigger your symptoms\n" +
                    "•\tEat high-fiber foods\n" +
                    "•\tDrink plenty of fluids\n" +
                    "•\tExercise regularly\n" +
                    "•\tGet enough sleep \n");
        if (s.equals("Kidney Stones"))
            T.append("\n" +
                    "Drinking six to eight glasses of water a day increases urine flow. People who are dehydrated or have severe nausea and vomiting may need intravenous fluids.");
        if (s.equals("Low Blood Sugar"))
            T.append("Consuming high-sugar foods or drinks, such as orange juice or regular fizzy drinks, can treat this condition. Alternatively, medication can be used to raise blood sugar levels. It's also important that a doctor identifies and treats the underlying cause.");
        if (s.equals("Outer Ear Infection"))
            T.append("A person may be prescribed ear drops and advised to keep the ear dry.");
        if (s.equals("Pulpitis"))
            T.append("See your dentist if you notice any pain in your mouth. If you have pulpitis, treating it early may help prevent irreversible pulpitis. Reversible pulpitis is treated by removing the cavity and filling the tooth. A root canal or tooth extraction may be used for irreversible pulpitis.");
        if (s.equals("Treatment usually includes medication to decrease stomach acid production. If it is caused by bacteria, antibiotics may be required."));
        if (s.equals("Tonsillitis"))
            T.append("•\tEncourage rest\n" +
                    "•\tProvide adequate fluids. \n" +
                    "•\tProvide comforting foods and beverage. \n" +
                    "•\tPrepare a saltwater gargle. \n" +
                    "•\tHumidify the air. \n" +
                    "•\tOffer lozenges. \n" +
                    "•\tAvoid irritants.\n" +
                    "•\tTreat pain and fever.\n" +
                    "\n");
        if (s.equals("Tooth Decay"))
            T.append("Treatments include fluoride, fillings and crowns. Severe cases may need a root canal or removal.");
        if (s.equals("Urinary Tract Infection"))
            T.append("Antibiotics usually are the first line treatment for urinary tract infections. Which drugs are prescribed and for how long depend on your health condition and the type of bacteria found in your urine.");
    }

}
