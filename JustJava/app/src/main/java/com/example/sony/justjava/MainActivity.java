package com.example.sony.justjava;
/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

import static android.os.Build.VERSION_CODES.N;

/**This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int q=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox h= (CheckBox) findViewById(R.id.is_cheked);
        boolean m=h.isChecked();
        CheckBox op= (CheckBox) findViewById(R.id.is_chekedd);
        boolean ik=op.isChecked();
        EditText name= (EditText) findViewById(R.id.name);
        String name_m=name.getText().toString();
        int k=calculate(q);
        if(m==true){
            k=k+2;
        }
        if(ik=true){
            k=k+3;
        }
        String meessage="Name :"+name_m+"\n"+"Quantity="+q+"\n"+"You need to pay :"+"Rs "+k+"\n Stuffing- whipped cream :"+m+"\n Stuffing- chocklate :"+ik+"\n";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        //intent.putExtra(Intent.EXTRA_EMAIL, "bakersgallery@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT,"coffe order from "+name_m);
        intent.putExtra(Intent.EXTRA_TEXT,meessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        displayMessage(meessage);
        }




















  public void  increment(View view){
      if(q==100){return;}
          q=q+1;
      display(q);
  }




    public void  decrement(View view){
        if(q==1){return;}
      q=q-1 ; display(q);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.ordersummary_text_view);
        priceTextView.setText(message);
    }
    private int calculate(int a){
        int r;
        r=a*5;
        return r;
    }


}






