package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imagedisplay = (ImageView) findViewById(R.id.imagedecisions);
        Button ask_button = findViewById(R.id.button_ask);
        final int[] image_display = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final Random random = new Random();
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = random.nextInt(5);
                imagedisplay.setImageResource(image_display[number]);
            }
        });
    }
}
