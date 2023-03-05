package com.example.ngotrackermum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity
{
    private Spinner spinner;
    private Spinner spinner3;
    private Button button3;
    private Button button4;
    private Intent intent1;
    private Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.Locations, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Spinner spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence>adapter1=ArrayAdapter.createFromResource(this, R.array.Causes, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter1);

        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this,MapsActivity.class);
                startActivity(intent1);
            }
        });
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc = (String) spinner.getSelectedItem();
                String cause = (String) spinner3.getSelectedItem();
                if(loc.equals("Choose location")&&(cause.equals("Choose cause")))
                {
                    Toast.makeText(MainActivity2.this, "Choose a location or Cause", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent2 = new Intent(MainActivity2.this,MainActivity3.class);
                    intent2.putExtra("location",loc);
                    intent2.putExtra("cause",cause);
                    startActivity(intent2);
                }
            }
        });
    }
}