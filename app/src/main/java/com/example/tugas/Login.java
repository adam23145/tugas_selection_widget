package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    //Membuat variable
    Button buttonLogin;
    TextView textViewSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //agar nilai dari button sesuai dengan layout maka masukkan id dari layout
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewSignUp = findViewById(R.id.signUpText);

        //untuk memndihkan layout Login ke Daftar menu
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaftarMenu.class);
                startActivity(intent);
                finish();
            }
        });

        //text view ini merupakan text dan text nya dibuat agar bisa di klik untuk masuk
        //ke layout signUp
        textViewSignUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), signUp.class);
                startActivity(intent);
                finish();
            }
        });

    }
}