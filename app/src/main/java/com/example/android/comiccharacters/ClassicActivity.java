package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> classicCharacters = new ArrayList<Character>();

        classicCharacters.add(new Character("Asterix", "See more details on web", R.drawable.classic_asterix_small, "https://en.wikipedia.org/wiki/Asterix"));
        classicCharacters.add(new Character("Blueberry", "See more details on web", R.drawable.classic_blueberry_small, "https://en.wikipedia.org/wiki/Blueberry_(comics)"));
        classicCharacters.add(new Character("Corto Maltese", "See more details on web", R.drawable.classic_corto_maltese_small, "https://en.wikipedia.org/wiki/Corto_Maltese"));
        classicCharacters.add(new Character("Gaston", "See more details on web", R.drawable.classic_gaston_small, "https://en.wikipedia.org/wiki/Gaston_(comics)"));
        classicCharacters.add(new Character("Jeremiah", "See more details on web", R.drawable.classic_jeremiah_small, "https://en.wikipedia.org/wiki/Jeremiah_(comics)"));
        classicCharacters.add(new Character("Judge Dredd", "See more details on web", R.drawable.classic_judge_dredd_small, "https://en.wikipedia.org/wiki/Judge_Dredd"));
        classicCharacters.add(new Character("Lucky Luke", "See more details on web", R.drawable.classic_lucky_luke_small, "https://hr.wikipedia.org/wiki/Lucky_Luke"));
        classicCharacters.add(new Character("Prince Valiant", "See more details on web", R.drawable.classic_prince_valiant_small, "https://en.wikipedia.org/wiki/Prince_Valiant"));
        classicCharacters.add(new Character("Tintin", "See more details on web", R.drawable.classic_tintin_small, "https://en.wikipedia.org/wiki/The_Adventures_of_Tintin"));
        classicCharacters.add(new Character("Valerian", "See more details on web", R.drawable.classic_valerian_small, "https://en.wikipedia.org/wiki/Val%C3%A9rian_and_Laureline"));

        ListView listView = findViewById(R.id.list_of_characters);
        CharacterAdapter adapter = new CharacterAdapter(ClassicActivity.this, classicCharacters, R.color.brown_classic);
        listView.setAdapter(adapter);
    }
}