package com.example.quickpic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {

    ImageButton imgBtnMountain;
    ImageButton imgBtnFish;
    ImageButton imgBtnTree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        imgBtnMountain = findViewById(R.id.imgBtnMountain);
        imgBtnMountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtra("TOPIC",'m');
                startActivity(intent);
            }
        });
        imgBtnFish = findViewById(R.id.imgBtnFish);
        imgBtnFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtra("TOPIC",'f');
                startActivity(intent);
            }
        });
        imgBtnTree = findViewById(R.id.imgBtnTree);
        imgBtnTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                intent.putExtra("TOPIC",'t');
                startActivity(intent);
            }
        });

        // zum Testen der Highscoreliste - einfach value veraendern, Run app, und dann vom
        // Startbildschirm aus direkt mit dieser Punktzahl in den Highscorebildschirm springen
        Button Highscore = findViewById(R.id.button);
        Highscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                intent.putExtra("Points",10);
                startActivity(intent);
            }
        });

    }
}
