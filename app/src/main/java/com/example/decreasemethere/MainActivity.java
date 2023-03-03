package com.example.decreasemethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Username = findViewById(R.id.editTextTextPersonName2);
        EditText Password = findViewById(R.id.editTextNumberPassword2);



        Button buttonLEav = findViewById(
                R.id.button2
        );
        buttonLEav.setOnClickListener(view -> {
            Intent LEavIntent = new Intent(
                    getApplicationContext(), LEav.class
            );
            if(Username.getText().toString().equals("jusep") && Password.getText().toString().equals("1115")){
                startActivity(LEavIntent);
            } else{
                Toast.makeText(getApplicationContext(), "Incorrect Creds", Toast.LENGTH_LONG).show();
            }

        });
    }
}
