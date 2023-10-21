package com.example.colors;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");

        View secondActivityLayout = findViewById(R.id.secondActivityLayout);

        if (color != null) {
            if (color.equals("red")) {
                secondActivityLayout.setBackgroundColor(Color.RED);
            } else if (color.equals("green")) {
                secondActivityLayout.setBackgroundColor(Color.GREEN);
            } else if (color.equals("blue")) {
                secondActivityLayout.setBackgroundColor(Color.BLUE);
            }
        }
    }
}
