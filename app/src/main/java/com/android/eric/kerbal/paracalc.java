package com.android.eric.kerbal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class paracalc extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_paracalc);
        Spinner planet = (Spinner) findViewById(R.id.planetspinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planetsarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        planet.setAdapter(adapter);


        Spinner mk16s = (Spinner) findViewById(R.id.mk16spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk16adapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mk16s.setAdapter(mk16adapter);


        Spinner mk16xls = (Spinner) findViewById(R.id.mk16xlspinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk16xladapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mk16xls.setAdapter(mk16xladapter);


        Spinner mk25s = (Spinner) findViewById(R.id.mk25spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk25adapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mk25s.setAdapter(mk25adapter);
    }

}




