
package com.example.shahrinlabfinal;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BMICalc extends AppCompatActivity {
    RadioGroup rgroup;
    EditText heightET, weightET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);
        rgroup= findViewById(R.id.rgroup);
        heightET= findViewById(R.id.heightET);
        weightET= findViewById(R.id.weightET);
    }

    public void CalcButtonFnc(View view) {
        double height=Double.parseDouble(heightET.getText().toString());
        double weight=Double.parseDouble(weightET.getText().toString());
        int selectedradiobuttonid=rgroup.getCheckedRadioButtonId();
        double result=0;
        if(selectedradiobuttonid==R.id.maleRB)
        {
            result= weight/(height*height);
            Toast.makeText(this, "Your BMI Score is : "+result+" ", Toast.LENGTH_SHORT).show();

        }
        else if(selectedradiobuttonid==R.id.femaleRB)
        {
            result= weight/(height*height);
            Toast.makeText(this, "Your BMI Score is : "+result+" ", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this, "Please Select Male or Female", Toast.LENGTH_SHORT).show();
        }

    }
}