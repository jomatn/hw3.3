package com.example.hw33;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MusicAdapter musicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MusicTrack> trackList = generateMusicTrackList();
        musicAdapter = new MusicAdapter(trackList);
        recyclerView.setAdapter(musicAdapter);
    }

    private List<MusicTrack> generateMusicTrackList() {
        List<MusicTrack> trackList = new ArrayList<>();
        trackList.add(new MusicTrack("golden hour", "JVKE"));
        trackList.add(new MusicTrack("Yes and?", "Ariana Grande"));
        trackList.add(new MusicTrack("Enemy", "Imagine Dragons"));
        trackList.add(new MusicTrack("7 rings", "Ariana Grande"));
        trackList.add(new MusicTrack("Believer", "Imagine Dragons"));
        trackList.add(new MusicTrack("Skyfall", "Adele"));
        trackList.add(new MusicTrack("Butter", "BTS"));
        trackList.add(new MusicTrack("Treat you better", "Shawn Mendes"));
        trackList.add(new MusicTrack("MAMMAMIA", "Maneskin"));
        trackList.add(new MusicTrack("Snowman", "Sia"));
        trackList.add(new MusicTrack("Sebelep", "Jax"));
        return trackList;
    }
}

