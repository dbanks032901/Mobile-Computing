package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button2;
    MediaPlayer mpChimes;
    int ChimesPlaying = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button switchButton = findViewById(R.id.switchButton);

        button2 = findViewById(R.id.chimes);
        mpChimes = MediaPlayer.create(this, R.raw.chimes);

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ChimesPlaying == 0) {
                    mpChimes.start();
                    ChimesPlaying = 1;
                } else {
                    mpChimes.pause();
                    ChimesPlaying = 0;
                }
            }
        });
    }
}
