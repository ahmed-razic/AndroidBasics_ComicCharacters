package com.example.android.comiccharacters;

public class Character {
    private final String mCharacterName;
    private final String mCharacterDescription;
    private final int mImageResourceId;
    private final static int HAS_AUDIO_RESOURCE = -1;
    private int mAudioResourceId = HAS_AUDIO_RESOURCE;


    public Character(String characterName, String characterDescription, int imageResourceId, int audioResourceId) {
        mCharacterName = characterName;
        mCharacterDescription = characterDescription;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Character(String characterName, String characterDescription, int imageResourceId) {
        mCharacterName = characterName;
        mCharacterDescription = characterDescription;
        mImageResourceId = imageResourceId;
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
}
