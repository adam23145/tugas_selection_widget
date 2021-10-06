package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DaftarMenu extends AppCompatActivity {

    //membuat variable
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        ListView listView = (ListView) findViewById(R.id.listView);

        //Bawah ini fungsinya untuk ketika klik button back pada
        //layout activity_Daftarmenu maka akan otomatis pindah ke login.class
        button = findViewById(R.id.buttonback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        //difungsikan untuk mengisi menu
        String[] menu = {"Movie"};
        //adapter
        ArrayAdapter<String> myAdapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menu);
        listView.setAdapter(myAdapter);
        //difungsikan untuk menampilkan apa yang di klik menggunakan toast dan
        //menggunakan intent pindah ke MainActivity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String menu = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(),menu,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}