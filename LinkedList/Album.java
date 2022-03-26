package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<Song>();
  }

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public void printSongs() {
    for (int i=0; i<this.songs.size(); i++) {
      System.out.println(i+1 + ". " + this.songs.get(i).getTitle());
    }
  }

  public boolean addSong(String title, double duration) {
    if (findSong(title) == null) {
      Song newSong = new Song(title, duration);
      songs.add(newSong);
      return true;
    }
    return false;
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

  public boolean addToPlayList(int songNumberInAlbum, LinkedList<Song> playList) {
    int songIndex = songNumberInAlbum - 1;
    if (songIndex >= 0 && songIndex <= this.songs.size()) {
      playList.add(this.songs.get(songIndex));
      return true;
    }
    System.out.println("This album does not have the track " + songNumberInAlbum);
    return false;
  }

  public boolean addToPlayList(String title, LinkedList<Song> playList) {
    Song song = findSong(title);
    if (song != null) {
      playList.add(song);
      return true;
    }
    return false;
  }
}
