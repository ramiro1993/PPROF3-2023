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

    private TextView mBufferingTextView;
    private static final String VIDEO_SAMPLE = "mivideo.mp4";
    private VideoView mVideoView;
    private int mCurrentPosition = 0;
    private static final String PLAYBACK_TIME = "play_time";
    private int mPosiciónActual = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);




        mVideoView = findViewById(R.id.videoview);
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(PLAYBACK_TIME);
        }
        MediaController controlador = new MediaController(this);
        controlador.setMediaPlayer(mVideoView);

        mVideoView.setMediaController(controlador);

        mBufferingTextView = findViewById(R.id.buffering_textview);
    }



    private Uri getMedia(String mediaName) {
        //      return Uri.parse("android.resource://" + getPackageName() +
        //            "/raw/" + mediaName);
        if (URLUtil.isValidUrl(mediaName)) {
// media name is an external URL
            return Uri.parse(mediaName);
        } else { // media name is a raw resource embedded in the app
            return Uri.parse("android.resource://" + getPackageName() +
                    "/raw/" + mediaName);
        }
    }


    private void initializePlayer() {
        mBufferingTextView.setVisibility(VideoView.VISIBLE);

        Uri videoUri = getMedia(VIDEO_SAMPLE);
        mVideoView.setVideoURI(videoUri);

        mVideoView.start();
        mVideoView.setOnPreparedListener(
                new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mBufferingTextView.setVisibility(VideoView.INVISIBLE);
                        if (mCurrentPosition > 0) {
                            mVideoView.seekTo(mCurrentPosition);
                        } else {
                            mVideoView.seekTo(1);
                        }
                        mVideoView.start();
                    }});
        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
// Implementation here.
            }
        });
        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(OrderDetails.this, "Playback completed",
                        Toast.LENGTH_SHORT).show();
                mVideoView.seekTo(1);
            }
        });

    }


    private void releasePlayer() {
        mVideoView.stopPlayback();
    }
    @Override
    protected void onStart() {
        super.onStart();
        initializePlayer();
    }
    @Override
    protected void onStop() {
        super.onStop();
        releasePlayer();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(PLAYBACK_TIME, mVideoView.getCurrentPosition());
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            mVideoView.pause();
        }
    }


}