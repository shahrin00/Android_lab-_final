package com.example.shahrinlabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Converter extends AppCompatActivity {
    EditText usdET;
    TextView outputTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        usdET= findViewById(R.id.usdET);
        outputTV=findViewById(R.id.bdtTV);
    }

    public void ConvertFunc(View view) {
        double usd=Double.parseDouble(usdET.getText().toString());
        double result=0;
        result=usd*102.52;
        outputTV.setText(""+result);


    }
}