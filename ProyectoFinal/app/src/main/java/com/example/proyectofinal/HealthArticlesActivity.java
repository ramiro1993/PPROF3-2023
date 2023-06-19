package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthArticlesActivity extends AppCompatActivity implements View.OnClickListener {

    Button ejercicios, recetas, prevencion;
    Button btn;

    private final static String ejercicios_url = "https://www.lavoz.com.ar/deportes/y-mas/actividad-fisica-libre-y-gratuita-en-la-ciudad-de-cordoba-dias-horarios-y-lugares/";
    private final static String recetas_url = "https://cordobanutricion.com/recetas/blog/page/2/";
    private final static String prevencion_url = "https://www.rafaelbarrientosnaz.com/blog/prevencion-de-enfermedades-infecciosas/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_articles);

        ejercicios = findViewById(R.id.button_ejercicios);
        recetas = findViewById(R.id.button_recetas);
        prevencion = findViewById(R.id.button_prevencion);
        btn = findViewById(R.id.buttonDDBack);

        ejercicios.setOnClickListener(this);
        recetas.setOnClickListener(this);
        prevencion.setOnClickListener(this);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);

        if (v.getId() == R.id.button_ejercicios) {
            intent.setData(Uri.parse(ejercicios_url));
            startActivity(intent);
        } else if (v.getId() == R.id.button_recetas) {
            intent.setData(Uri.parse(recetas_url));
            startActivity(intent);
        } else if (v.getId() == R.id.button_prevencion) {
            intent.setData(Uri.parse(prevencion_url));
            startActivity(intent);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthArticlesActivity.this, HomeActivity.class));
            }
        });

    }
}
