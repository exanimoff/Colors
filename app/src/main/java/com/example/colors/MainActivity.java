package com.example.colors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText colorInput;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorInput = findViewById(R.id.colorInput);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = colorInput.getText().toString();
                if (color.equals("red") || color.equals("green") || color.equals("blue")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("color", color);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Введите правильное слово (red, green или blue)", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
