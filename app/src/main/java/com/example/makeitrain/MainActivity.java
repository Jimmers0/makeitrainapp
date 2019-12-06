package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

//    private Button showMoney;
//    private Button showTag;

    private int moneyCounter = 0;
    private TextView moneyText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);

//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("My Tag", "onClick: Show Money!");
//
//
//            }
//        });
    }

    public void showTag(View v){
        Log.d("my tag", "showTag: Show tag");
        Toast.makeText(getApplicationContext(), "HELLO THERE!", Toast.LENGTH_LONG).show();

    }

    public void makeItRain(View v) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 1000;
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter) ));
        Log.d("my tag", "makeItRain: Tapped " + moneyCounter);

    }
}
