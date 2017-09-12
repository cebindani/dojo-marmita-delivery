package com.dmaila.dojo.marmitadelivery;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;
    String mealSize;
    String mainMeal;
    String sideDish;
    String observationText;
    String orderToSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText nameEditText = (EditText) findViewById(R.id.name);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.meal_size_radiogroup);
        final EditText mainMealEditText = (EditText) findViewById(R.id.main_meal);
        final EditText sideDishEditText = (EditText) findViewById(R.id.side_dish);
        final EditText observationEditText = (EditText) findViewById(R.id.observation);
        Button sendButton = (Button) findViewById(R.id.send_button);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedID) {
                RadioButton radioButton = (RadioButton) findViewById(checkedID);
                mealSize = radioButton.getText().toString();
//                Toast.makeText(MainActivity.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = nameEditText.getText().toString();
                mainMeal = mainMealEditText.getText().toString();
                sideDish = sideDishEditText.getText().toString();
                observationText = observationEditText.getText().toString();

                orderToSend = "Nome: " + name + "\n" +
                        "Tamanho: " + mealSize + "\n" +
                        "Mistura: " + mainMeal + "\n" +
                        "Acompanhamento: " + sideDish + "\n" +
                        "Observações: " + observationText;
                Toast.makeText(MainActivity.this, orderToSend, Toast.LENGTH_SHORT).show();

            }
        });


    }


}



