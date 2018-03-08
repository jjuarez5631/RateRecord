package com.example.jjuarez.raterecord;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    MediaPlayer mpSongOne, mpSongTwo, mpSongThree;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btnSongOne);
        button2 = (Button) findViewById(R.id.btnSongTwo);
        button3 = (Button) findViewById(R.id.btnSongThree);

        button1.setOnClickListener(bSongOne);
        button2.setOnClickListener(bSongTwo);
        button3.setOnClickListener(bSongThree);


        mpSongOne = new MediaPlayer();
        mpSongOne = MediaPlayer.create(this, R.raw.jungle);

        mpSongTwo = new MediaPlayer();
        mpSongTwo = MediaPlayer.create(this, R.raw.thrill);

        mpSongThree = new MediaPlayer();
        mpSongThree = MediaPlayer.create(this, R.raw.immigration);
        playing = 0;

        //Button cost = (Button) findViewById(R.id.b);
    }

        Button.OnClickListener bSongOne = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpSongOne.start();
                        playing = 1;
                        button1.setText("Pause");
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpSongOne.pause();
                        playing = 0;
                        button1.setText("Play");
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };

        Button.OnClickListener bSongTwo = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing) {
                    case 0:
                        mpSongTwo.start();
                        playing = 1;
                        button2.setText("Pause");
                        button1.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpSongTwo.pause();
                        playing = 0;
                        button2.setText("Play");
                        button1.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };

        Button.OnClickListener bSongThree = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing) {
                    case 0:
                        mpSongThree.start();
                        playing = 1;
                        button3.setText("Pause");
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpSongThree.pause();
                        playing = 0;
                        button3.setText("Play");
                        button1.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };


}
