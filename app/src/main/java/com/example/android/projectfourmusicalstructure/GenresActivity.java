package com.example.android.projectfourmusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);

        ArrayList<Music> artistsArray = new ArrayList<>();
        artistsArray.add(new Music("Jazz", ""));
        artistsArray.add(new Music("Rock", ""));
        artistsArray.add(new Music("Pop", ""));
        final MusicAdapter adapter = new MusicAdapter(this, artistsArray);
        ListView listView = findViewById(R.id.list);
        listView.setBackgroundColor(getResources().getColor(R.color.background_color));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(GenresActivity.this, "Now playing genre", Toast.LENGTH_SHORT).show();
            }
        });
    }
}