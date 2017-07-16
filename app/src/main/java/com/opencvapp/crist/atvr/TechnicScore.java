package com.opencvapp.crist.atvr;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.NumberPicker;
import android.widget.Toast;

public class TechnicScore extends AppCompatActivity {

    private NumberPicker unitNumber;
    private NumberPicker decimalNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_technic_score);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        unitNumber = (NumberPicker)findViewById(R.id.unitNumber);
        decimalNumber = (NumberPicker)findViewById(R.id.decimalNumber);

        unitNumber.setMinValue(0);
        unitNumber.setMaxValue(10);
        unitNumber.setWrapSelectorWheel(true);

        decimalNumber.setMinValue(0);
        decimalNumber.setMaxValue(9);
        decimalNumber.setWrapSelectorWheel(true);

        ((FloatingActionButton)findViewById(R.id.score_tec)).setOnClickListener(customOnClick);
    }

    View.OnClickListener customOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int unit = ((NumberPicker)findViewById(R.id.unitNumber)).getValue();
            int decimal = ((NumberPicker)findViewById(R.id.decimalNumber)).getValue();

            Toast.makeText(getApplicationContext(),String.valueOf(unit) + "," + String.valueOf(decimal) + "."
                    ,Toast.LENGTH_SHORT).show();
        }
    };
}
