package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyMedicineActivity extends AppCompatActivity implements View.OnClickListener {

    Button lider, farmacity, gralpaz;
    Button btn;

    private final static String lider_url = "https://farmaciaslider.com.ar/";
    private final static String farmacity_url = "https://www.farmacity.com/";
    private final static String gralpaz_url = "https://www.farmaciageneralpaz.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine);

        lider = findViewById(R.id.button_lider);
        farmacity = findViewById(R.id.button_farmacity);
        gralpaz = findViewById(R.id.button_gralpaz);
        btn = findViewById(R.id.buttonDDBack);

        lider.setOnClickListener(this);
        farmacity.setOnClickListener(this);
        gralpaz.setOnClickListener(this);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);

        if (v.getId() == R.id.button_lider) {
            intent.setData(Uri.parse(lider_url));
            startActivity(intent);
        } else if (v.getId() == R.id.button_farmacity) {
            intent.setData(Uri.parse(farmacity_url));
            startActivity(intent);
        } else if (v.getId() == R.id.button_gralpaz) {
            intent.setData(Uri.parse(gralpaz_url));
            startActivity(intent);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyMedicineActivity.this, HomeActivity.class));
            }
        });

    }
}
