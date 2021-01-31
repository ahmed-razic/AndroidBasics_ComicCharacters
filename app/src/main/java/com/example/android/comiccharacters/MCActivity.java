package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> mcCharacters = new ArrayList<Character>();

        mcCharacters.add(new Character("Antman", "See more details on web", R.drawable.mc_antman_small, R.raw.mc_antman, "https://en.wikipedia.org/wiki/Ant-Man"));
        mcCharacters.add(new Character("Black Widow", "See more details on web", R.drawable.mc_black_widow_small, R.raw.mc_black_widow, "https://en.wikipedia.org/wiki/Black_Widow_(Marvel_Comics)"));
        mcCharacters.add(new Character("Captain America", "See more details on web", R.drawable.mc_captain_america_small, R.raw.mc_captain_america, "https://en.wikipedia.org/wiki/Captain_America_(comic_book)"));
        mcCharacters.add(new Character("Hulk", "See more details on web", R.drawable.mc_hulk_small, R.raw.mc_hulk, "https://en.wikipedia.org/wiki/Hulk_Comic"));
        mcCharacters.add(new Character("Ironman", "See more details on web", R.drawable.mc_ironman_small, R.raw.mc_ironman, "https://en.wikipedia.org/wiki/Iron_Man"));
        mcCharacters.add(new Character("Loki", "See more details on web", R.drawable.mc_loki_small, R.raw.mc_loki, "https://en.wikipedia.org/wiki/Loki_(comics)"));
        mcCharacters.add(new Character("Nick Fury", "See more details on web", R.drawable.mc_nick_fury_small, R.raw.mc_nick_fury, "https://en.wikipedia.org/wiki/Nick_Fury"));
        mcCharacters.add(new Character("Spiderman", "See more details on web", R.drawable.mc_spiderman_small, R.raw.mc_spiderman, "https://en.wikipedia.org/wiki/Peter_Parker:_Spider-Man"));
        mcCharacters.add(new Character("Thanos", "See more details on web", R.drawable.mc_thanos_small, R.raw.mc_thanos, "https://en.wikipedia.org/wiki/Thanos"));
        mcCharacters.add(new Character("Thor", "See more details on web", R.drawable.mc_thor_small, R.raw.mc_thor, "https://en.wikipedia.org/wiki/Thor_(Marvel_Comics)"));

        ListView listView = findViewById(R.id.list_of_characters);
        CharacterAdapter adapter = new CharacterAdapter(MCActivity.this, mcCharacters, R.color.red_mc);
        listView.setAdapter(adapter);
    }
}