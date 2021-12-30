package com.example.kalkulatorv2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HitungOnclick(View V){
        EditText firstnumberEdit = (EditText) findViewById(R.id.firstnumberEdit);
        EditText secondnumberEdit = (EditText) findViewById(R.id.secondnumberEdit);

        int firstnumber = Integer.parseInt(firstnumberEdit.getText().toString());
        int secondnumber = Integer.parseInt(secondnumberEdit.getText().toString());

        RadioButton radioTambah = (RadioButton) findViewById(R.id.radioTambah);
        RadioButton radioKurang = (RadioButton) findViewById(R.id.radioKurang);
        RadioButton radioKali = (RadioButton) findViewById(R.id.radioKali);
        RadioButton radioBagi = (RadioButton) findViewById(R.id.radioBagi);

        int result = 0;

        if (radioTambah.isChecked()) {
            result =  + secondnumber;

        } else if(radioKurang.isChecked()) {
            result = firstnumber - secondnumber;
        } else if(radioKali.isChecked()) {
            result = firstnumber * secondnumber;
        } else if (radioBagi. isChecked()) {
            result = firstnumber / secondnumber;
        }
        TextView viewHasil = (TextView) findViewById(R.id.viewHasil);
        viewHasil.setText("Result: " + result);
    }


}