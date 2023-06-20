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
        vv1.setVideoURI(Uri.parse("https://rr2---sn-bg0eznsy.googlevideo.com/videoplayback?expire=1687249924&ei=pA-RZOi6DKKLx_APruq7wAo&ip=141.193.20.227&id=o-AEjiTS1QEISuX6WZ-RUpuiJEUtFbS1T0I9Z850HKOiF1&itag=18&source=youtube&requiressl=yes&spc=qEK7B_Esecs2OahyVUBXnTGpZUqbs8M18t_jhIO-sg&vprv=1&svpuc=1&mime=video%2Fmp4&ns=-jhBdLSxF8yyAqbVqAUv_HsN&gir=yes&clen=2638128&ratebypass=yes&dur=50.665&lmt=1667823371675523&fexp=24007246,24350017&beids=24350017&c=WEB&txp=6219224&n=x4LZfi5hO7Spnw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgdDMZwTVQMD0jBJjw36z4oHPEiST0ZAG-6-jupTIbcN8CIQDqMwDgWOlLTce7lMsb_09PPFXvqfeM0fCxYC29wDJ9sA%3D%3D&redirect_counter=1&cm2rm=sn-5hnesy7z&req_id=7ddc4088f7aa3ee&cms_redirect=yes&cmsv=e&mh=68&mip=181.1.12.121&mm=34&mn=sn-bg0eznsy&ms=ltu&mt=1687227892&mv=m&mvi=2&pl=22&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRAIgbL8bsSAWNnYyX-gcBcbemXw4dLRAbjVgwbJDJne15qECIGK6H0xDWwuWjqwVSCB3i5uOJAyIMwgURNoZxM8FjDIs"));

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