package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        ImageButton imCalendar = findViewById(R.id.imCalendar);
        imCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Messages.this, Calendar.class);
                startActivity(intent);
            }
        });

        ImageButton imCheckIn = findViewById(R.id.imCheckIn);
        imCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Messages.this, CheckIn.class);
                startActivity(intent);
            }
        });

        ImageButton imMessages = findViewById(R.id.imMessages);
        imMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Messages.this, Messages.class);
                startActivity(intent);
            }
        });

        ImageButton imQuote = findViewById(R.id.imQuote);
        imQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Messages.this, Quote.class);
                startActivity(intent);
            }
        });

        WebView webView = findViewById(R.id.webView);

        webView.loadUrl("https://secure.helloalma.com");
    }




}