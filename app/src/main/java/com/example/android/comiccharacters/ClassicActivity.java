package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> classicCharacters = new ArrayList<Character>();

        classicCharacters.add(new Character("Asterix", "Short description of character", R.drawable.classic_asterix_small));
        classicCharacters.add(new Character("Blueberry", "Short description of character", R.drawable.classic_blueberry_small));
        classicCharacters.add(new Character("Corto Maltese", "Short description of character", R.drawable.classic_corto_maltese_small));
        classicCharacters.add(new Character("Gaston", "Short description of character", R.drawable.classic_gaston_small));
        classicCharacters.add(new Character("Jeremiah", "Short description of character", R.drawable.classic_jeremiah_small));
        classicCharacters.add(new Character("Judge Dredd", "Short description of character", R.drawable.classic_judge_dredd_small));
        classicCharacters.add(new Character("Lucky Luke", "Short description of character", R.drawable.classic_lucky_luke_small));
        classicCharacters.add(new Character("Prince Valiant", "Short description of character", R.drawable.classic_prince_valiant_small));
        classicCharacters.add(new Character("Tintin", "Short description of character", R.drawable.classic_tintin_small));
        classicCharacters.add(new Character("Valerian", "Short description of character", R.drawable.classic_valerian_small));
    }
}