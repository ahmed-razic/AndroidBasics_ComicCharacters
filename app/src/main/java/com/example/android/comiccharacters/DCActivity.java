package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class DCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> dcCharacters = new ArrayList<Character>();

        dcCharacters.add(new Character("Aquaman", "Short description of character", R.drawable.dc_aquaman_small, R.raw.dc_aquaman));
        dcCharacters.add(new Character("Batman", "Short description of character", R.drawable.dc_batman_small, R.raw.dc_batman));
        dcCharacters.add(new Character("Catwoman", "Short description of character", R.drawable.dc_catwoman_small, R.raw.dc_catwoman));
        dcCharacters.add(new Character("Cyclops", "Short description of character", R.drawable.dc_cyclops_small, R.raw.dc_cyclops));
        dcCharacters.add(new Character("Flash", "Short description of character", R.drawable.dc_flash_small, R.raw.dc_flash));
        dcCharacters.add(new Character("Green Lantern", "Short description of character", R.drawable.dc_green_lantern_small, R.raw.dc_green_lantern));
        dcCharacters.add(new Character("Joker", "Short description of character", R.drawable.dc_joker_small, R.raw.dc_joker));
        dcCharacters.add(new Character("Superman", "Short description of character", R.drawable.dc_superman_small, R.raw.dc_superman));
        dcCharacters.add(new Character("The Thing", "Short description of character", R.drawable.dc_the_thing_small, R.raw.dc_the_thing));
        dcCharacters.add(new Character("Wonder Woman", "Short description of character", R.drawable.dc_wonder_woman_small, R.raw.dc_wonder_woman));
    }
}