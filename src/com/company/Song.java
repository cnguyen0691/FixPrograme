package com.company;

public class Song {

    private String Artist;
    private String Title;

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString(){
        return getArtist()+"\n"+getTitle();
    }
}
