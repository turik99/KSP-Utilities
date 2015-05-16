package com.android.eric.kerbal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class paracalc extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_paracalc);

        Spinner planet = (Spinner) findViewById(R.id.planetspinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planetsarray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        planet.setAdapter(adapter);


        Spinner mk16 = (Spinner) findViewById(R.id.mk16spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk16adapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         // Apply the adapter to the spinner
        mk16.setAdapter(mk16adapter);


        Spinner mk16xl = (Spinner) findViewById(R.id.mk16xlspinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk16xladapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mk16xl.setAdapter(mk16xladapter);






        Spinner mk25 = (Spinner) findViewById(R.id.mk25spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk25adapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mk25.setAdapter(mk25adapter);


        Spinner mk2 = (Spinner) findViewById(R.id.mk2spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> mk2adapter = ArrayAdapter.createFromResource(this,
                R.array.numbersarray, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mk2.setAdapter(mk2adapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) parent;
        if (spinner.getId() == R.id.planetspinner){
            if (position == 0){
                String planet = "Kerbin";

            }
            if (position == 1){
                String planet = "Duna";

            }
            if (position == 2){
                String planet = "Laythe";
            }
            if (position == 3){
                String planet = "Eve";
            }
        }
        if(spinner.getId() == R.id.mk16spinner){
            if (position == 0){
                int mk16paracount = 1;
            }
            if (position == 1){
                int mk16paracount = 2;

            }
            if (position == 2){
                int mk16paracount = 3;
            }
            if (position == 3){
                int mk16paracount = 4;
            }
            else{
                int mk16paracount = 5;
            }
        }
        if (spinner.getId() == R.id.mk25spinner){
            if (position == 0){
                int mk25paracount = 1;
            }
            if (position == 1){
                int mk25paracount = 2;

            }
            if (position == 2){
                int mk25paracount = 3;
            }
            if (position == 3){
                int mk25paracount = 4;
            }
            else{
                int mk25paracount = 5;
            }
        }
        if (spinner.getId() == R.id.mk16xlspinner){
            if (position == 0){
                int mk16xlparacount = 1;
            }
            if (position == 1){
                int mk16xlparacount = 2;

            }
            if (position == 2){
                int mk16xlparacount = 3;
            }
            if (position == 3){
                int mk16xlparacount = 4;
            }
            else{
                int mk16xlparacount = 5;
            }
        }
        if (spinner.getId() == R.id.mk2spinner){
            if (position == 0){
                int mk2paracount = 1;
            }
            if (position == 1){
                int mk2paracount = 2;

            }
            if (position == 2){
                int mk2paracount = 3;
            }
            if (position == 3){
                int mk2paracount = 4;
            }
            else{
                int mk2paracount = 5;
            }
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
