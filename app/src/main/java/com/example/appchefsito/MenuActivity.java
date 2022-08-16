package com.example.appchefsito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private Button btnBuscar;
    private Button btnCerrar;
    private Button btnPerfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnBuscar = (Button) findViewById(R.id.btnBuscar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        btnPerfil = (Button) findViewById(R.id.btnPerfil);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "Funcion no disponible", Toast.LENGTH_SHORT).show();
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,PerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}