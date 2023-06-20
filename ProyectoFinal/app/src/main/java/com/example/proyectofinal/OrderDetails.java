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
        vv1.setVideoURI(Uri.parse("https://rr3---sn-bg0eznsy.googlevideo.com/videoplayback?expire=1687248537&ei=OQqRZJyUCdmL_9EP6oqWoAE&ip=102.165.16.155&id=o-AN6gH5kpK65y3vreTbnUEaxxBk3-B4hoewpgMtd8wgWl&itag=18&source=youtube&requiressl=yes&spc=qEK7B4BSPQS1HW9K-SLTV2Ex13gimyVv9EvZkECerw&vprv=1&svpuc=1&mime=video%2Fmp4&ns=izpaVvoSV9micL0z98Bs6PwN&gir=yes&clen=10542498&ratebypass=yes&dur=165.790&lmt=1667521747646914&fexp=24007246,24363391&c=WEB&txp=5319224&n=aIsyOW5H-icQlw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgBsSpDYUcyboCE9uANgMIQKxZsqjJdhqcOOgfep7zgccCIQDhLtAoeyi9AUmUr4hRU57oOxwZbz_l7subp1yhFX_szA%3D%3D&redirect_counter=1&cm2rm=sn-q4fezk7l&req_id=2cac19d559a6a3ee&cms_redirect=yes&cmsv=e&mh=rm&mip=181.1.12.121&mm=34&mn=sn-bg0eznsy&ms=ltu&mt=1687226454&mv=m&mvi=3&pl=22&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAMj2LhPWUnr6_rKiO6vyTNgVPORG6riDGERKzZi0flHjAiEAxNgL78QSule9ocFqjH5YggK5tYy58aXfjBJ_dhtS-Ik%3D"));

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