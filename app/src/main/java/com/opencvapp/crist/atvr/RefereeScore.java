package com.opencvapp.crist.atvr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.NumberPicker;

public class RefereeScore extends AppCompatActivity {

    private NumberPicker unitNumber;
    private NumberPicker decimalNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_referee_score);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        unitNumber = (NumberPicker)findViewById(R.id.unitNumber);
        decimalNumber = (NumberPicker)findViewById(R.id.decimalNumber);

        unitNumber.setMinValue(0);
        unitNumber.setMaxValue(10);
        unitNumber.setWrapSelectorWheel(true);

        decimalNumber.setMinValue(0);
        decimalNumber.setMaxValue(10);
        decimalNumber.setWrapSelectorWheel(true);
    }
}
