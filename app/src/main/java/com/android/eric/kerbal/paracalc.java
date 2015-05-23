package com.android.eric.kerbal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class paracalc extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int mk16xlparacalc;
    int mk2paracalc;







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



    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int mk16xlparacount;

        switch (parent.getId()){
            case R.id.mk16xlspinner:
                switch (position){
                    case 0:
                        mk16xlparacount = 1;
                        break;


                    case 1:
                        mk16xlparacount = 2;
                        break;

                    case 2:
                        mk16xlparacount = 3;
                        break;

                    case 3:

                        mk16xlparacount = 4;

                        break;

                    case 4:
                        mk16xlparacount = 5;
                        break;


                }
                break;
            case R.id.mk16spinner:
                switch (position){

                }

        }
    }

    public void paracalced(View view){


        double gravityconstant  = Math.pow(6.674*10,-11);
        double kerbinmass = Math.pow(5.291579*10,22);
        double kerbinradiussquare = Math.pow(600000, 2);
        double econstant = 271828183;
        double kerbinpressurescaleheight = 5000;






        try{
            EditText eweight = (EditText)findViewById(R.id.weightedit);
            EditText ealtitude = (EditText)findViewById(R.id.altitude);
            double weight = Double.valueOf(eweight.getText().toString());
            double altitude = Double.valueOf(ealtitude.getText().toString());

            double finalspeed = Math.sqrt(2*(weight)*(9.81)/(1));
            Toast paratoast = Toast.makeText(getApplicationContext(), String.valueOf(finalspeed), Toast.LENGTH_SHORT);
            paratoast.show();
            Toast spinnertest = Toast.makeText(this, String.valueOf(mk16xlparacalc), Toast.LENGTH_SHORT);
            spinnertest.show();
        }
        catch (Exception e){
            Toast paraerror = Toast.makeText(getApplicationContext(), "Please enter valid values", Toast.LENGTH_SHORT);
            paraerror.show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
