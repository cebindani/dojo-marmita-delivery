package com.dmaila.dojo.marmitadelivery;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText nameEditText = (EditText) findViewById(R.id.name);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.meal_size_radiogroup);
        EditText mainMealEditText = (EditText) findViewById(R.id.main_meal);
        EditText sideDishEditText = (EditText) findViewById(R.id.side_dish);
        EditText observationEditText = (EditText) findViewById(R.id.observation);
        Button sendButton = (Button) findViewById(R.id.send_button);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedID) {
                RadioButton radioButton = (RadioButton) findViewById(checkedID);

                Toast.makeText(MainActivity.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }


}



