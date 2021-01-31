package com.example.android.comiccharacters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class CharacterAdapter extends ArrayAdapter<Character> {

    private final int mColorResourceId;

    public CharacterAdapter(@NonNull Context context, @NonNull ArrayList<Character> characters, int colorResourceId) {
        super(context, 0, characters);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item_character, parent, false);
        }

        Character currentCharacter = getItem(position);

        ImageView itemImage = itemView.findViewById(R.id.item_image);
        itemImage.setImageResource(currentCharacter.getImageResourceId());

        TextView itemName = itemView.findViewById(R.id.item_name);
        itemName.setText(currentCharacter.getCharacterName());

        TextView itemDescription = itemView.findViewById(R.id.item_description);
        itemDescription.setText(currentCharacter.getCharacterDescription());

        ImageView itemPlay = itemView.findViewById(R.id.play_image);

        if(currentCharacter.hasAudio()) {
            itemPlay.setVisibility(View.VISIBLE);
        } else {
            itemPlay.setVisibility(View.GONE);
        }

        View textContainer = itemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        setClickListener(itemImage, position, parent);
        setClickListener(itemPlay, position, parent);
        setClickListener(itemDescription, position, parent);

        return itemView;
    }

    private void setClickListener(View view, final int position, final ViewGroup parent) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // this part is important, it lets ListView handle the clicks
                ((ListView) parent).performItemClick(v, position, 0);
            }
        });
    }
}
