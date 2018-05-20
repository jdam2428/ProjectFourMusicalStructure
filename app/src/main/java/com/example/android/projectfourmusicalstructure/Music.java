package com.example.android.projectfourmusicalstructure;

public class Music {

    private String mArtistName;
    private String mSongName;

    public Music(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmSongName() {
        return mSongName;
    }

}