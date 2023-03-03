package com.example.decreasemethere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PutMeDown extends AppCompatActivity {
    private TextView countTextView;
    private TextView countTextView2;
    private TextView countTextView3;
    private TextView countTextView4;
    private TextView countTextView5;

    private TextView priceTextView;
    private TextView priceTextView2;
    private TextView priceTextView3;
    private TextView priceTextView4;
    private TextView priceTextView5;

    //Item Name
    private TextView itemTextView;
    private TextView itemTextView2;
    private TextView itemTextView3;
    private TextView itemTextView4;
    private TextView itemTextView5;

    //total
    private TextView totalCOOOL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put_me_down);

        //total
        totalCOOOL = findViewById(R.id.food16);
        totalCOOOL.setText(LEav.total + "p");

        //Quantity, Price, Item Name
        //chicken
        countTextView = findViewById(R.id.food34);
        priceTextView = findViewById(R.id.food39);
        itemTextView = findViewById(R.id.food15);

        itemTextView.setText(LEav.ItemChicken);
        countTextView.setText( LEav.buttonCount + "x");
        int totalCount = LEav.totalCount;
        priceTextView.setText(totalCount + "p");

        //burger
        countTextView2 = findViewById(R.id.food35);
        priceTextView2 = findViewById(R.id.food40);
        itemTextView2 = findViewById(R.id.food30);

        itemTextView2.setText(LEav.ItemBurger);
        countTextView2.setText( LEav.buttonCount2 + "x");
        int totalCount2 = LEav.totalCount2;
        priceTextView2.setText(totalCount2 + "p");
        //sandwitch
        countTextView3 = findViewById(R.id.food36);
        priceTextView3 = findViewById(R.id.food41);
        itemTextView3 = findViewById(R.id.food31);

        itemTextView3.setText(LEav.ItemSanwitch);
        countTextView3.setText( LEav.buttonCount3 + "x");
        int totalCount3 = LEav.totalCount3;
        priceTextView3.setText(totalCount3 + "p");
        //fries
        priceTextView4 = findViewById(R.id.food42);
        countTextView4 = findViewById(R.id.food37);
        itemTextView4 = findViewById(R.id.food32);

        itemTextView4.setText(LEav.ItemFries);
        countTextView4.setText( LEav.buttonCount4 + "x");
        int totalCount4 = LEav.totalCount4;
        priceTextView4.setText(totalCount4 + "p");
        //soda
        countTextView5 = findViewById(R.id.food38);
        priceTextView5 = findViewById(R.id.food43);
        itemTextView5 = findViewById(R.id.food33);

        itemTextView5.setText(LEav.ItemSoda);
        countTextView5.setText( LEav.buttonCount5 + "x");
        int totalCount5 = LEav.totalCount5;
        priceTextView5.setText(totalCount5 + "p");
    }

}