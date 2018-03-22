package com.example.sony.myquize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        ArrayList<String> nu= new ArrayList<String>();
        nu.add("one");
        nu.add("two");
        nu.add("three");
        nu.add("four");
        nu.add("five");
        nu.add("six");
        nu.add("seven");
        nu.add("eight");
        nu.add("nine");
        nu.add("ten");


        LinearLayout ji= (LinearLayout)findViewById(R.id.kj);
           TextView jk= new TextView(this);
           jk.setText(nu.get(0));
          ji.addView(jk);




    }
}
