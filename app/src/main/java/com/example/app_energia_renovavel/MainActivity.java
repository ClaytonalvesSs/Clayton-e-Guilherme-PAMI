package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void janelasolar(View view){
        Intent intent = new Intent(this, tela_solar.class);
        startActivity(intent);
    }

    public void janelaeolica(View view){
        Intent intent = new Intent(this, tela_eolica.class);
        startActivity(intent);
    }

    public void janelahidreletrica(View view){
        Intent intent = new Intent(this, tela_hidreletrica.class);
        startActivity(intent);
    }

    public void janelaoceanica(View view){
        Intent intent = new Intent(this, tela_oceanica.class);
        startActivity(intent);
    }
}