package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class day4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);

        ImageButton imCalendar = findViewById(R.id.imCalendar);
        imCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(day4.this, Calendar.class);
                startActivity(intent);
            }
        });

        ImageButton imCheckIn = findViewById(R.id.imCheckIn);
        imCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(day4.this, CheckIn.class);
                startActivity(intent);
            }
        });

        ImageButton imMessages = findViewById(R.id.imMessages);
        imMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(day4.this, Messages.class);
                startActivity(intent);
            }
        });

        ImageButton imQuote = findViewById(R.id.imQuote);
        imQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(day4.this, Quote.class);
                startActivity(intent);
            }
        });
    }
}