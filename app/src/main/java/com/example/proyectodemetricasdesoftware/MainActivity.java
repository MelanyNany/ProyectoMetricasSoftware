package com.example.proyectodemetricasdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_nueva;
    private Button button_vieja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_nueva = (Button)findViewById(R.id.button1);
        button_nueva.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Nueva_Entrada();
            }
        });

        button_vieja = (Button)findViewById(R.id.button2);
        button_vieja.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Vieja_Entrada();
            }
        });
    }

    public void Nueva_Entrada() {
        Intent intent =  new Intent(this, Nueva_Entrada.class);
        startActivity(intent);
    }

    public void Vieja_Entrada() {
        Intent intent =  new Intent(this, Vieja_Entrada.class);
        startActivity(intent);
    }
}