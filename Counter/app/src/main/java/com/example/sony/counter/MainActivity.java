package com.example.sony.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int a=0;int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void add1(View view){
        a=a+1;
        da(a);
    }

    public void add2(View view){
        a=a+2;
        da(a);
    }

    public void add4(View view){
        a=a+4;
        da(a);
    }

    public void add6(View view){
        a=a+6;
        da(a);
    }
    public void add1b(View view){
       b=b+1;
       db(b);
   }
    public void add2b(View view){
        b=b+2;
        db(b);
    }
    public void add4b(View view){
        b=b+4;
        db(b);
    }
    public void add6b(View view){
        b=b+6;
        db(b);
    }
    public void reset(View view){
        a=0;
        b=0;
        da(a);
        db(b);

    }
     private void da(int a){
        TextView q = (TextView) findViewById(R.id.scoreA);
        q.setText(""+a);
    }
    private void db(int b){
        TextView qb = (TextView) findViewById(R.id.scoreB);
        qb.setText(""+b);
    }
}
