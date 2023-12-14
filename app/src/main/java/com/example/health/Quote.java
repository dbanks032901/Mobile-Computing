package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class Quote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        ImageButton imCalendar = findViewById(R.id.imCalendar);
        imCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quote.this, Calendar.class);
                startActivity(intent);
            }
        });

        ImageButton imCheckIn = findViewById(R.id.imCheckIn);
        imCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quote.this, CheckIn.class);
                startActivity(intent);
            }
        });

        ImageButton imMessages = findViewById(R.id.imMessages);
        imMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quote.this, Messages.class);
                startActivity(intent);
            }
        });

        ImageButton imQuote = findViewById(R.id.imQuote);
        imQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quote.this, Quote.class);
                startActivity(intent);
            }
        });


        ListView listview;

        String[] dayQuote = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        listview = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, dayQuote);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(Quote.this, day1.class));
                        break;
                    case 1:
                        startActivity(new Intent(Quote.this, day2.class));
                        break;
                    case 2:
                        startActivity(new Intent(Quote.this, day3.class));
                        break;
                    case 3:
                        startActivity(new Intent(Quote.this, day4.class));
                        break;
                    case 4:
                        startActivity(new Intent(Quote.this, day5.class));
                        break;
                    case 5:
                        startActivity(new Intent(Quote.this, day6.class));
                        break;
                    case 6:
                        startActivity(new Intent(Quote.this, day7.class));
                        break;
                }
            }
        });
    }
    }
