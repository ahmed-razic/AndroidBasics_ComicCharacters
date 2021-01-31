package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bonelliComics = findViewById(R.id.bon_comics_textview);
        bonelliComics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BonelliActivity.class);
                startActivity(intent);
            }
        });

        TextView dcComics = findViewById(R.id.dc_comics_textview);
        dcComics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DCActivity.class);
                startActivity(intent);
            }
        });

        TextView mcComics = findViewById(R.id.mc_comics_textview);
        mcComics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MCActivity.class);
                startActivity(intent);
            }
        });

        TextView classicComics = findViewById(R.id.classic_comics_textview);
        classicComics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClassicActivity.class);
                startActivity(intent);
            }
        });
    }
}