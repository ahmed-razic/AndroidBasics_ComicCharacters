package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class BonelliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> bonelliCharacters = new ArrayList<Character>();

        bonelliCharacters.add(new Character("Captain Miki", "Short description for character", R.drawable.bon_captain_miki, R.raw.bon_captain_miki));
        bonelliCharacters.add(new Character("Commandant Mark", "Short description for character", R.drawable.bon_comandant_mark_small, R.raw.bon_comandant_mark));
        bonelliCharacters.add(new Character("Dylan Dog", "Short description for character", R.drawable.bon_dylan_dog_small, R.raw.bon_dylan_dog));
        bonelliCharacters.add(new Character("Grand Blek", "Short description for character", R.drawable.bon_grand_blek, R.raw.bon_grand_blek));
        bonelliCharacters.add(new Character("Ken Parker", "Short description for character", R.drawable.bon_ken_parker_small, R.raw.bon_ken_parker));
        bonelliCharacters.add(new Character("Kit Willer", "Short description for character", R.drawable.bon_kit_willer_small, R.raw.bon_kit_willer));
        bonelliCharacters.add(new Character("Martin Mystery", "Short description for character", R.drawable.bon_martin_mysterie_small, R.raw.bon_martin_mysterie));
        bonelliCharacters.add(new Character("Mister No", "Short description for character", R.drawable.bon_mister_no_small, R.raw.bon_mister_no));
        bonelliCharacters.add(new Character("Tex Willer", "Short description for character", R.drawable.bon_tex_willer_small, R.raw.bon_tex_willer));
        bonelliCharacters.add(new Character("Zagor", "Short description for character", R.drawable.bon_zagor_small, R.raw.bon_zagor));
    }
}