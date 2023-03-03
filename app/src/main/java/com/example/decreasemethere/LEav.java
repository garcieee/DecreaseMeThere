package com.example.decreasemethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LEav extends AppCompatActivity {
    //Food Variables
    //Chicken
    private Button Chicken;
    private TextView countChicken;
    static int buttonCount = 0;
    private int multiplier = 120;
    public static int totalCount = 0;
    public static String ItemChicken = "Chicken";
    //Burger
    private Button Burger;
    private TextView countBurger;
    static int buttonCount2 = 0;
    private int multiplier2 = 100;
    public static int totalCount2 = 0;
    public static String ItemBurger = "Burger";
    //Sanwitch
    private Button Sanwitch;
    private TextView countSanwitch;
    static int buttonCount3 = 0;
    private int multiplier3 = 80;
    public static int totalCount3 = 0;
    public static String ItemSanwitch = "Sanwitch";
    //Fries

    private Button Fries;
    private TextView countFries;
    static int buttonCount4 = 0;
    private int multiplier4 = 50;
    public static int totalCount4 = 0;
    public static String ItemFries = "Fries";
    //Soda

    private Button Soda;
    private TextView countSoda;
    static int buttonCount5 = 0;
    private int multiplier5 = 50;
    public static int totalCount5 = 0;
    public static String ItemSoda = "Soda";

    //total
    public static int total= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leav);


        Button buttonPutMeDown = findViewById(
                R.id.button10
        );

        buttonPutMeDown.setOnClickListener(view -> {
            Intent storeIntent = new Intent(getApplicationContext(), PutMeDown.class);
            total = totalCount + totalCount2 + totalCount3 + totalCount4 + totalCount5;
            startActivity(storeIntent);
        });

        Chicken = findViewById(R.id.button);
        countChicken = findViewById(R.id.textView11);

        Chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCount++;
                totalCount = buttonCount * multiplier;
                ItemChicken = "Chicken";
                countChicken.setText(buttonCount + "x");
            }
        });//Chicken Quantity

        Burger = findViewById(R.id.button9);
        countBurger = findViewById(R.id.textView16);

        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCount2++;
                ItemBurger = "Burger";
                totalCount2 = buttonCount2 * multiplier2;
                countBurger.setText(buttonCount2 + "x");
            }
        });//Burger Quantity

        Sanwitch = findViewById(R.id.button5);
        countSanwitch = findViewById(R.id.textView15);

        Sanwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCount3++;
                ItemSanwitch = "Sanwitch";
                totalCount3 = buttonCount3 * multiplier3;
                countSanwitch.setText(buttonCount3 + "x");
            }
        });//Sanwitch Quantity

        Fries = findViewById(R.id.button3);
        countFries = findViewById(R.id.textView);

        Fries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCount4++;
                ItemFries = "Fries";
                totalCount4 = buttonCount4 * multiplier4;
                countFries.setText(buttonCount4 + "x");
            }
        });//Fries Quantity

        Soda = findViewById(R.id.button6);
        countSoda = findViewById(R.id.textView14);

        Soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCount5++;
                ItemSoda = "Soda";
                totalCount5 = buttonCount5 * multiplier5;
                countSoda.setText(buttonCount5 + "x");
            }
        });//Soda Quantity
    }
}

