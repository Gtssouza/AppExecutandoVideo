package com.example.appexecutandovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Esconde a statusBar e a barra de navegação
        View decorView = getWindow().getDecorView();
        int uiOp = View.SYSTEM_UI_FLAG_FULLSCREEN;//mostra fullscreen

        decorView.setSystemUiVisibility(uiOp);

        //esconde a actionBar
        getSupportActionBar().hide();

        videoView = findViewById(R.id.videoView);
        //executar o video
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.start();

    }
}
