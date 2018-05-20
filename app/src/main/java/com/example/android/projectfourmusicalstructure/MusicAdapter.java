package com.example.android.projectfourmusicalstructure;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {


    public MusicAdapter(Context context, ArrayList<Music> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        Music currentMusic = getItem(position);

        TextView artistName = listItemView.findViewById(R.id.artistName);
        artistName.setText(currentMusic.getmArtistName());

        TextView musicName = listItemView.findViewById(R.id.songName);
        musicName.setText(currentMusic.getmSongName());

        ImageView image = listItemView.findViewById(R.id.image);
        image.getDrawable();

        View textContainer = listItemView.findViewById(R.id.text_container);

        return listItemView;

    }

}