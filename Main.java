package com.learn.uzair.ugpacs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main extends AppCompatActivity{

    private String spinnerItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner numberOfSubjectsSpinner = findViewById(R.id.spinner_number_of_subjects);

        ArrayAdapter<CharSequence> numberOfSubjectsAA = ArrayAdapter.createFromResource(this,R.array.numbers_of_subjects,android.R.layout.simple_spinner_item);
        numberOfSubjectsAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numberOfSubjectsSpinner.setAdapter(numberOfSubjectsAA);

        numberOfSubjectsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerItem = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void goToInputActivity(View view){
        switch(spinnerItem){
            case "3":
                Intent to3Subject = new Intent(this,Subject3.class);
                startActivity(to3Subject);
                break;
            case "4":
                Intent to4Subject = new Intent(this,Subject4.class);
                startActivity(to4Subject);
                break;
            case "5":
                Intent to5Subject = new Intent(this,Subject5.class);
                startActivity(to5Subject);
                break;
            case "6":
                Intent to6Subject = new Intent(this,Subject6.class);
                startActivity(to6Subject);
                break;
            case "7":
                Intent to7Subject = new Intent(this,Subject7.class);
                startActivity(to7Subject);
                break;
            case "8":
                Intent to8Subject = new Intent(this,Subject8.class);
                startActivity(to8Subject);
                break;
            case "9":
                Intent to9Subject = new Intent(this,Subject9.class);
                startActivity(to9Subject);
                break;
            case "10":
                Intent to10Subject = new Intent(this,Subject10.class);
                startActivity(to10Subject);
                break;
        }
    }
}
