package com.example.proyectofinal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
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
        vv1.setVideoURI(Uri.parse("https://rr2---sn-bg0eznsy.googlevideo.com/videoplayback?expire=1688024086&ei=tt-cZMHmI6SLx_APz5-NmAE&ip=176.125.230.22&id=o-AIwzEYYspIR026HdR7Ddc6PdbOPrc1nVsCvo6sTiRu-A&itag=18&source=youtube&requiressl=yes&spc=qEK7B9kl-TSetPFcAQJbCXkgRl8mCdzS1o5FbACnPQ&vprv=1&svpuc=1&mime=video%2Fmp4&ns=pRtnrzV5aer6cRPAGESfNn8N&gir=yes&clen=2638128&ratebypass=yes&dur=50.665&lmt=1667823371675523&fexp=24007246,24350018,24362687&beids=24350018&c=WEB&txp=6219224&n=cYoP4ke2wog1Mw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgAUuhQ-0m0yX4monyqx5CftuqsP9t9cpo09wUWfzWz2ACIFb8pvh6ytIxhdGZwPmrHg80LpLPERG-RbwDBN5eCDIg&redirect_counter=1&cm2rm=sn-5hnesk7z&req_id=96e51f17b2aaa3ee&cms_redirect=yes&cmsv=e&mh=68&mip=181.10.97.71&mm=34&mn=sn-bg0eznsy&ms=ltu&mt=1688002147&mv=m&mvi=2&pl=22&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgEap2wkNN-58U99pg7qwdLjMF-Ce-P4yPdEPZ_LxPk90CIQCz0cQqCc7dW0WufSZVW4Mp7zMA74Bg33FEHLXSMOi_9w%3D%3D"));
        Log.i("Video_url", "https://rr2---sn-bg0eznsy.googlevideo.com/videoplayback?expire=1688024086&ei=tt-cZMHmI6SLx_APz5-NmAE&ip=176.125.230.22&id=o-AIwzEYYspIR026HdR7Ddc6PdbOPrc1nVsCvo6sTiRu-A&itag=18&source=youtube&requiressl=yes&spc=qEK7B9kl-TSetPFcAQJbCXkgRl8mCdzS1o5FbACnPQ&vprv=1&svpuc=1&mime=video%2Fmp4&ns=pRtnrzV5aer6cRPAGESfNn8N&gir=yes&clen=2638128&ratebypass=yes&dur=50.665&lmt=1667823371675523&fexp=24007246,24350018,24362687&beids=24350018&c=WEB&txp=6219224&n=cYoP4ke2wog1Mw&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgAUuhQ-0m0yX4monyqx5CftuqsP9t9cpo09wUWfzWz2ACIFb8pvh6ytIxhdGZwPmrHg80LpLPERG-RbwDBN5eCDIg&redirect_counter=1&cm2rm=sn-5hnesk7z&req_id=96e51f17b2aaa3ee&cms_redirect=yes&cmsv=e&mh=68&mip=181.10.97.71&mm=34&mn=sn-bg0eznsy&ms=ltu&mt=1688002147&mv=m&mvi=2&pl=22&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgEap2wkNN-58U99pg7qwdLjMF-Ce-P4yPdEPZ_LxPk90CIQCz0cQqCc7dW0WufSZVW4Mp7zMA74Bg33FEHLXSMOi_9w%3D%3D");
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