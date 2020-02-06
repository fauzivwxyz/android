package com.akeno.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountDollar = editText.getText().toString();

        double amountDollarDouble = Double.parseDouble(amountDollar);

        double amountRupiahDouble = amountDollarDouble * 13000;

        String amountRupiahString = String.format("%.2f", amountRupiahDouble);

        Toast.makeText(this, "$" + amountDollar + " is Rp." + amountRupiahString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
