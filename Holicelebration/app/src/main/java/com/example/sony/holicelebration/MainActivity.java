package com.example.sony.holicelebration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void book(){
        ImageView q=(ImageView) findViewById(R.id.imagev);
        q.setImageResource(R.drawable.a);

        TextView d=(TextView) findViewById(R.id.text_v);
        d.setText("YOU ARE BOOKED , EXCITED  TO SEE YOU THEIR :-)");
    }
    public void info(){

        ImageView q=(ImageView) findViewById(R.id.imagev);
        q.setImageResource(R.drawable.b);
        TextView d=(TextView) findViewById(R.id.text_v);
        d.setText("COMMUNITY HALL ,3rd STREET,SAIRA TOWER ,NEW DELHI ");

    }
}
