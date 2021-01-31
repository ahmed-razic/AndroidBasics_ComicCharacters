package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> dcCharacters = new ArrayList<Character>();

        dcCharacters.add(new Character("Aquaman", "See more details on web", R.drawable.dc_aquaman_small, R.raw.dc_aquaman, "https://en.wikipedia.org/wiki/Aquaman"));
        dcCharacters.add(new Character("Batman", "See more details on web", R.drawable.dc_batman_small, R.raw.dc_batman, "https://en.wikipedia.org/wiki/Batman"));
        dcCharacters.add(new Character("Catwoman", "See more details on web", R.drawable.dc_catwoman_small, R.raw.dc_catwoman, "https://en.wikipedia.org/wiki/Catwoman"));
        dcCharacters.add(new Character("Cyclops", "See more details on web", R.drawable.dc_cyclops_small, R.raw.dc_cyclops, "https://en.wikipedia.org/wiki/Cyclops_(Marvel_Comics)"));
        dcCharacters.add(new Character("Flash", "See more details on web", R.drawable.dc_flash_small, R.raw.dc_flash, "https://en.wikipedia.org/wiki/Flash_(DC_Comics_character)"));
        dcCharacters.add(new Character("Green Lantern", "See more details on web", R.drawable.dc_green_lantern_small, R.raw.dc_green_lantern, "https://en.wikipedia.org/wiki/Green_Lantern"));
        dcCharacters.add(new Character("Joker", "See more details on web", R.drawable.dc_joker_small, R.raw.dc_joker, "https://en.wikipedia.org/wiki/The_Joker_(comic_book)"));
        dcCharacters.add(new Character("Superman", "See more details on web", R.drawable.dc_superman_small, R.raw.dc_superman, "https://en.wikipedia.org/wiki/Superman_(comic_book)"));
        dcCharacters.add(new Character("Bane", "See more details on web", R.drawable.dc_bane_small, R.raw.dc_bane, "https://en.wikipedia.org/wiki/Bane_(DC_Comics)"));
        dcCharacters.add(new Character("Wonder Woman", "See more details on web", R.drawable.dc_wonder_woman_small, R.raw.dc_wonder_woman, "https://en.wikipedia.org/wiki/Wonder_Woman"));

        ListView listView = findViewById(R.id.list_of_characters);
        CharacterAdapter adapter = new CharacterAdapter(DCActivity.this, dcCharacters, R.color.blue_dc);
        listView.setAdapter(adapter);
    }
}
