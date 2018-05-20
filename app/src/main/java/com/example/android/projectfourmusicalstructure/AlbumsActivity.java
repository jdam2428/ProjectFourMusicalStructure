package com.example.android.projectfourmusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);

        ArrayList<Music> artistsArray = new ArrayList<>();
        artistsArray.add(new Music("Red Hot Chili Peppers", "One Hot Minute"));
        artistsArray.add(new Music("Red Hot Chili Peppers", "Californication"));
        artistsArray.add(new Music("Red Hot Chili Peppers", "By the Way"));
        artistsArray.add(new Music("SBTRKT", "Transitions"));
        artistsArray.add(new Music("SBTRKT", "Wonder Where We Land"));
        artistsArray.add(new Music("SBTRKT", "Save Yourself"));
        artistsArray.add(new Music("Bonobo", "Black Sands"));
        artistsArray.add(new Music("Bonobo", "The North Borders"));
        artistsArray.add(new Music("Bonobo", "Migration"));
        final MusicAdapter adapter = new MusicAdapter(this, artistsArray);
        ListView listView = findViewById(R.id.list);
        listView.setBackgroundColor(getResources().getColor(R.color.background_color));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AlbumsActivity.this, "Now playing album", Toast.LENGTH_SHORT).show();
            }
        });
    }
}