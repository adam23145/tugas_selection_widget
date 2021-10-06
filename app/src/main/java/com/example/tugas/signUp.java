package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    //memasukkan nilai kota ke cities
    private static final String[] CITIES = new String[]{
            "Jember","Pasuruan","Probolinggo","Malang","Bondowoso","Situbondo","Surabaya","Madiun","Blitar"};

    //membuat variable
    Button button;
    Spinner spinner;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        AutoCompleteTextView ediText = findViewById(R.id.autoComplete);
        ArrayAdapter<String> halo =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,CITIES);
        ediText.setAdapter(halo);

        //untuk masuk ke layout login
        textView = findViewById(R.id.loginText);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });
        //untuk masuk ke menu login ketika memencet button
        button = findViewById(R.id.buttonSignUp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        //untuk memunculkan nama kota yang di pilih
        spinner = findViewById(R.id.textLayoutLokasi);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Kota, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String kota = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), ""+kota,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}