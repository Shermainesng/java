package Innerclasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

  private String name;
  private String artist;
  private SongList songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new SongList();
  }

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public void printSongs() {
    this.songs.printSongs();
  }

  public boolean addSong(String title, double duration) {
    return this.songs.addSong(new Song(title, duration));
  }

  public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
    Song song = this.songs.findSong(trackNumber);
    if (song != null) {
      playList.add(song);
      return true;
    }
    System.out.println("The album does not have a track " + trackNumber);
    return false;
  }
  public boolean addToPlayList(String title, LinkedList<Song> playList) {
    Song song = this.songs.findSong(title);
    if (song != null) {
      playList.add(song);
      return true;
    }
    System.out.println("The album does not have a track " + title);
    return false;
  }

 //Innerclass
  private class SongList {

    private ArrayList<Song> songs;

    public SongList() {
      this.songs = new ArrayList<Song>();
    }

    public void printSongs() {
    for (int i=0; i<this.songs.size(); i++) {
      System.out.println(i+1 + ". " + this.songs.get(i).getTitle());
    }
  }

    public boolean addSong(Song song) {
      if (songs.contains(song)) {
        return false;
      }
      this.songs.add(song);
      return true;
    }

    private Song findSong(String title) {
    for(int i=0; i<this.songs.size();i++) {
      Song song = this.songs.get(i);
      if(song.getTitle() == title) {
        return song;
      }
    }
    return null;
  }

    private Song findSong(int trackNumber) {
      int index = trackNumber - 1;
      if (index >= 0 && index < this.songs.size()) {
        Song song = this.songs.get(index);
        return song;
      }
      return null;
    }
  }
}
