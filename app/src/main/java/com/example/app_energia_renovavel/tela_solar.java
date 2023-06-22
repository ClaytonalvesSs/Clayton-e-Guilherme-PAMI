package com.example.app_energia_renovavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela_solar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_solar);
    }

    public void voltarmenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}