package com.example.android.projectfourmusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);

        ArrayList<Music> artistsArray = new ArrayList<>();
        artistsArray.add(new Music("Red Hot Chili Peppers", "Under the Bridge"));
        artistsArray.add(new Music("Red Hot Chili Peppers", "Californication"));
        artistsArray.add(new Music("Red Hot Chili Peppers", "By the Way"));
        artistsArray.add(new Music("SBTRKT", "Wildfire"));
        artistsArray.add(new Music("SBTRKT", "Hold On"));
        artistsArray.add(new Music("SBTRKT", "Trials of the Past"));
        artistsArray.add(new Music("Bonobo", "Stay The Same"));
        artistsArray.add(new Music("Bonobo", "First Fires"));
        artistsArray.add(new Music("Bonobo", "Kerala"));

        final MusicAdapter adapter = new MusicAdapter(this, artistsArray);
        ListView listView = findViewById(R.id.list);
        listView.setBackgroundColor(getResources().getColor(R.color.background_color));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(SongsActivity.this, "Now playing song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}