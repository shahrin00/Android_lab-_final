package com.example.shahrinlabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] menu= {"BMI Calculator" , "USD to BDT Converter" , "Your Id" , "About Me"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, menu);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(menu[i]=="BMI Calculator")
                {
                    Intent myintent= new Intent(MainActivity.this,BMICalc.class);
                    startActivity(myintent);

                }
                else if(menu[i]=="USD to BDT Converter")
                {
                    Intent myintent= new Intent(MainActivity.this,Converter.class);
                    startActivity(myintent);

                }
                else if(menu[i]=="About Me")
                {
                    Intent myintent= new Intent(MainActivity.this,AboutMe.class);
                    startActivity(myintent);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "201-15-3335", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}