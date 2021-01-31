package com.example.android.comiccharacters;

import android.net.Uri;

public class Character {
    private final String mCharacterName;
    private final String mCharacterDescription;
    private final int mImageResourceId;
    private final static int HAS_AUDIO_RESOURCE = -1;
    private int mAudioResourceId = HAS_AUDIO_RESOURCE;
    private final Uri mWebLink;
    private final Uri mYoutubeLinkBonelli = Uri.parse("https://www.youtube.com/watch?v=eU-QK2dDZNk&ab_channel=SergioBonelliEditore");
    private final Uri mYoutubeLinkMC = Uri.parse("https://www.youtube.com/watch?v=uogjlOEeJw8&ab_channel=MarvelEntertainment");
    private final Uri mYoutubeLinkDC = Uri.parse("https://www.youtube.com/watch?v=1loq4Hx8bxo&ab_channel=DC");


    public Character(String characterName, String characterDescription, int imageResourceId, int audioResourceId, String webLink) {
        mCharacterName = characterName;
        mCharacterDescription = characterDescription;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
        mWebLink = Uri.parse(webLink);
    }

    public Character(String characterName, String characterDescription, int imageResourceId, String webLink) {
        mCharacterName = characterName;
        mCharacterDescription = characterDescription;
        mImageResourceId = imageResourceId;
        mWebLink = Uri.parse(webLink);
    }

    public String getCharacterName() {
        return mCharacterName;
    }

    public String getCharacterDescription() {
        return mCharacterDescription;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasAudio(){
        return (mAudioResourceId != HAS_AUDIO_RESOURCE);
    }

    public Uri getWebLink() { return mWebLink; }

    public Uri getYoutubeLinkMC() { return mYoutubeLinkMC; }

    public Uri getYoutubeLinkDC() { return mYoutubeLinkDC; }

    public Uri getmYoutubeLinkBonelli() { return mYoutubeLinkBonelli; }
}
