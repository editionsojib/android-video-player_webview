package com.editions.videoplayer_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button button_1, button_2, button_3, button_4, button_5, button_6, button_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        id find here

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
//        id find here end


//        onclick start here

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/UTx4fSMaYus?si=En84FcUTn9yH9icL%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/zPdMUNoXnB4?si=D0J4SYbCwK14iTi8%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/_3QOrtjxzcg?si=-zHepEMUlhEHyWZv%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/ni7YX77Evf8?si=gArGG-fWmSSe33D2%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/QYvn4s4ogsY?si=WcKb2W3LCR0sg1E1%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/YE9h_izeqUc?si=q4HTAjJCovYKbFx_%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                code here

                VideoPlayer.video_url="https://www.youtube.com/embed/VjPp6LbEIuE?si=fR1g22GXhcC4kFOG%22";

                Intent myintent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myintent);


            }
        });




//        onclick end here

    }
}