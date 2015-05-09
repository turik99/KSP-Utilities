package com.android.eric.kerbal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class deltacalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deltacalc);
    }
    public void dvcalc(View view){
        try{

            //Calling values of edittext with FINDVIEWBYID
            EditText fulledit = (EditText)findViewById(R.id.fulledit);
            EditText dryedit = (EditText)findViewById(R.id.dryedit);
            EditText ispedit = (EditText)findViewById(R.id.ispedit);
            //extracting double values
            double fullmass = Double.valueOf(fulledit.getText().toString());
            double drymass = Double.valueOf(dryedit.getText().toString());
            double isp = Double.valueOf(ispedit.getText().toString());
            double answer = Math.log(fullmass / drymass * isp * 9.81);

            Toast toast = new Toast(this);
            toast.setText(String.valueOf(answer));
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();

        }
        catch(Exception e){
            Toast error = new Toast(this);
            error.setText("Please enter a valid set of values");
            error.setDuration(Toast.LENGTH_SHORT);
            error.show();
        }

    }


}
