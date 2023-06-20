package com.example.proyectofinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OrderDetails extends AppCompatActivity {


    public VideoView vv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);

        vv1 =(VideoView) findViewById(R.id.vv1);

    }


    public void iniciar(View v)
    {
        vv1.setVideoURI(Uri.parse("https://www.scratchya.com.ar/video1.mp4"));

        vv1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                vv1.start();


            }


        });


    }
    public void pausar(View v)
    {
        vv1.pause();
    }
    public void continuar(View v)
    {
        vv1.start();
    }

          /* CardView exit = findViewById(R.id.cardFDSalir);
         exit.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View view) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        startActivity(new Intent(OrderDetails.this, HomeActivity.class));

        }
        });
*/










}