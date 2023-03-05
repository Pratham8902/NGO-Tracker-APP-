package com.example.ngotrackermum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private Button button2;
    private Button button3;
    //private Button button4;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button5);
        //button4 = findViewById(R.id.button);
        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Welcome to the App!!", Toast.LENGTH_SHORT).show();
            }
        }));
        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Welcome new user!!", Toast.LENGTH_SHORT).show();
            }
        }));
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Greetings!!", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}