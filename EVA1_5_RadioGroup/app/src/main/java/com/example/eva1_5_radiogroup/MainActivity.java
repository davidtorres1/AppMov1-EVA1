package com.example.eva1_5_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGroup = findViewById(R.id.rGroup);
        rGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String mensa = " ";
        if(i == R.id.rBtnTacos){
            mensa = "Tacos";
        }
        else if (i == R.id.rBtnTortas){
            mensa = "Tortas";
        }
        else if (i == R.id.rBtnMontados){
            mensa = "Montados";
        }
        else if (i == R.id.rBtnBurritos){
            mensa = "Burritos";
        }
        Toast.makeText(this, mensa, Toast.LENGTH_SHORT).show();
    }
}
