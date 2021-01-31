package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> mcCharacters = new ArrayList<Character>();

        mcCharacters.add(new Character("Antman", "Short description of character", R.drawable.mc_antman_small, R.raw.mc_antman));
        mcCharacters.add(new Character("Black Widow", "Short description of character", R.drawable.mc_black_widow_small, R.raw.mc_black_widow));
        mcCharacters.add(new Character("Captain America", "Short description of character", R.drawable.mc_captain_america_small, R.raw.mc_captain_america));
        mcCharacters.add(new Character("Hulk", "Short description of character", R.drawable.mc_hulk_small, R.raw.mc_hulk));
        mcCharacters.add(new Character("Ironman", "Short description of character", R.drawable.mc_ironman_small, R.raw.mc_ironman));
        mcCharacters.add(new Character("Loki", "Short description of character", R.drawable.mc_loki_small, R.raw.mc_loki));
        mcCharacters.add(new Character("Nick Fury", "Short description of character", R.drawable.mc_nick_fury_small, R.raw.mc_nick_fury));
        mcCharacters.add(new Character("Spiderman", "Short description of character", R.drawable.mc_spiderman_small, R.raw.mc_spiderman));
        mcCharacters.add(new Character("Thanos", "Short description of character", R.drawable.mc_thanos_small, R.raw.mc_thanos));
        mcCharacters.add(new Character("Thor", "Short description of character", R.drawable.mc_thor_small, R.raw.mc_thor));
    }
}