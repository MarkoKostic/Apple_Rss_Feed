package com.marko.top10downloader;

/**
 * Created by marko on 12.10.17.
 */

// Klasa u koju cemo da povlacimo info iz xml-a

public class FeedEntry {

    private String name;
    private String artist;
    private String releaseDate;
    private String summary;
    private String imageURL;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getArtist() { return artist; }

    public void setArtist(String artist) { this.artist = artist; }

    public String getReleaseDate() { return releaseDate; }

    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public String getSummary() { return summary; }

    public void setSummary(String summary) { this.summary = summary; }

    public String getImageURL() { return imageURL; }

    public void setImageURL(String imageURL) { this.imageURL = imageURL; }

//    @Override
//    public String toString() {
//        return "Name=" + name + '\n' +
//                "Artist=" + artist + '\n' +
//                "ReleaseDate=" + releaseDate + '\'' +
//                "ImageURL=" + imageURL + '\n';
//    }
}
