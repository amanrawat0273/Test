package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SubmitScreen extends AppCompatActivity {
    private TextView txtHelloWorld;
    private Spinner spinnerTextSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_submit_screen);





        String[] textSizes = getResources().getStringArray(R.array.type_array);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, textSizes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTextSize.setAdapter(adapter);
    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner1) {
            String valueFromSpinner = parent.getItemAtPosition(position).toString();
            txtHelloWorld.setTextSize(Float.parseFloat(valueFromSpinner));
        }
    }
}