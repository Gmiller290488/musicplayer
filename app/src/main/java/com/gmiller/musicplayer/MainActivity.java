package com.gmiller.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.holysmoke);

        Button play = (Button) this.findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mp.start();
            }
        });

        Button pause = (Button) this.findViewById(R.id.pause);

        pause.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        Button reset = (Button) this.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mp.seekTo(0);
                mp.start();
            }
        });

    }
}









