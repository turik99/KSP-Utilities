package com.android.eric.kerbal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "Delta V Calculator",
            "Parachute Calculator",
            "Celestial Body Info",
            "Kerbal Dev Blog"

    };

    Integer[] imgid={
            R.drawable.dvcalc,
            R.drawable.paracalc,
            R.drawable.celestinfo,
            R.drawable.devblog
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), deltacalc.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), paracalc.class);
                    startActivity(intent);
                }
                if (position == 2){

                }

            }
        });
    }

}
