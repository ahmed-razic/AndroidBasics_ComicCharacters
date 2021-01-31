package com.example.android.comiccharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BonelliActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if(focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                mMediaPlayer.stop();
                releaseMediaPlayer();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_characters);

        ArrayList<Character> bonelliCharacters = new ArrayList<Character>();

        bonelliCharacters.add(new Character("Captain Miki", "See more details on web", R.drawable.bon_captain_miki, R.raw.bon_captain_miki, "https://en.wikipedia.org/wiki/Captain_Miki"));
        bonelliCharacters.add(new Character("Commandant Mark", "See more details on web", R.drawable.bon_comandant_mark_small, R.raw.bon_comandant_mark, "https://en.wikipedia.org/wiki/Comandante_Mark"));
        bonelliCharacters.add(new Character("Dylan Dog", "See more details on web", R.drawable.bon_dylan_dog_small, R.raw.bon_dylan_dog, "https://en.wikipedia.org/wiki/Dylan_Dog"));
        bonelliCharacters.add(new Character("Grand Blek", "See more details on web", R.drawable.bon_grand_blek, R.raw.bon_grand_blek, "https://en.wikipedia.org/wiki/Il_Grande_Blek"));
        bonelliCharacters.add(new Character("Ken Parker", "See more details on web", R.drawable.bon_ken_parker_small, R.raw.bon_ken_parker, "https://it.wikipedia.org/wiki/Ken_Parker"));
        bonelliCharacters.add(new Character("Kit Willer", "See more details on web", R.drawable.bon_kit_willer_small, R.raw.bon_kit_willer, "https://it.wikipedia.org/wiki/Kit_Willer"));
        bonelliCharacters.add(new Character("Martin Mystery", "See more details on web", R.drawable.bon_martin_mysterie_small, R.raw.bon_martin_mysterie, "https://en.wikipedia.org/wiki/Martin_Mystery"));
        bonelliCharacters.add(new Character("Mister No", "See more details on web", R.drawable.bon_mister_no_small, R.raw.bon_mister_no, "https://en.wikipedia.org/wiki/Mister_No"));
        bonelliCharacters.add(new Character("Tex Willer", "See more details on web", R.drawable.bon_tex_willer_small, R.raw.bon_tex_willer, "https://en.wikipedia.org/wiki/Tex_Willer"));
        bonelliCharacters.add(new Character("Zagor", "See more details on web", R.drawable.bon_zagor_small, R.raw.bon_zagor, "https://en.wikipedia.org/wiki/Zagor"));

        ListView listView = findViewById(R.id.list_of_characters);
        CharacterAdapter adapter = new CharacterAdapter(BonelliActivity.this, bonelliCharacters, R.color.green_bon);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

                Character currentCharacter = bonelliCharacters.get(position);

                long viewId = view.getId();
                if (viewId == R.id.item_image) {
                    releaseMediaPlayer();

                    int result = mAudioManager.requestAudioFocus(onAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                    if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                        mMediaPlayer = MediaPlayer.create(BonelliActivity.this, currentCharacter.getAudioResourceId());
                        mMediaPlayer.start();

                        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                releaseMediaPlayer();
                            }
                        });
                    }

                } else if (viewId == R.id.play_image) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, currentCharacter.getmYoutubeLinkBonelli());
                    startActivity(intent);
                } else if( viewId == R.id.item_description) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, currentCharacter.getWebLink());
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer(){
        if(mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }

    }
}

