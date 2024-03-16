package com.example.hw33;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private List<MusicTrack> trackList;

    public MusicAdapter(List<MusicTrack> trackList) {
        this.trackList = trackList;
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        MusicTrack track = trackList.get(position);
        holder.titleTextView.setText(track.getTitle());
        holder.artistTextView.setText(track.getArtist());
    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView artistTextView;

        public MusicViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tv_title);
            artistTextView = itemView.findViewById(R.id.tv_artist);
        }
    }
}
