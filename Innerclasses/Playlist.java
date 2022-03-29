package Innerclasses;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;

public class Playlist {
  //songs from different albums can be added to the playlist
  //albums contains a list of songs
  private static ArrayList<Album> albums = new ArrayList<Album>();
  public static void main(String[] args) {
    //CREATE ALBUMS + ADD SONGS TO THEM
    Album albumOne = new Album("Red", "Taylor Swift");
    albumOne.addSong("Trecherous", 3.14);
    albumOne.addSong("State of Grace", 3.50);
    albumOne.addSong("All Too Well", 10.34);
    albumOne.addSong("22", 2.34);
    albums.add(albumOne);

    Album albumTwo = new Album("Birthplace", "Novo Amor");
    albumTwo.addSong("State Lines", 4.34);
    albumTwo.addSong("Anchor", 3.24);
    albums.add(albumTwo);

    LinkedList<Song> playList = new LinkedList<Song>();
    albums.get(0).addToPlayList("22", playList); //add 22 from 'red' into my playlist
    albums.get(0).addToPlayList("All Too Well", playList);
    albums.get(0).addToPlayList(2, playList);
    albums.get(1).addToPlayList(1, playList);
    albums.get(1).addToPlayList(2, playList);

    play(playList);
  }

  public static void play(LinkedList<Song> playList){
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;

    ListIterator<Song> listIterator = playList.listIterator();

    if(playList.isEmpty()) {
      System.out.println("No songs in the playlist");
      return;
    } else {
      System.out.println("Now playing " + listIterator.next());
      printMenu();
    }

    while(!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch(action) {
        case 0:
          System.out.println("Quit playlist");
          quit = true;
          break;
        case 1: //next song
          if (!forward) {
            if(listIterator.hasNext()) {
              listIterator.next();
            }
            forward = true;
          }
          if(listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next());
          } else {
            System.out.println("Reached the end of the playlist");
            forward = false;
          }
          break;
        case 2: //previous song
          if(forward) {
            if(listIterator.hasPrevious()) {
              listIterator.previous();
            }
            forward = false;
          }
          if(listIterator.hasPrevious()) {
            System.out.println("Playing previous song: " + listIterator.previous());
          } else {
            System.out.println("This is the first song in the playlist");
            forward = true;
          }
          break;
        case 3: //replay current song
          if (forward) {
            if(listIterator.hasPrevious()) {
              System.out.println("Playing current song again: " + listIterator.previous());
              forward = false;
            } else {
              System.out.println("we are at the start of the list");
            }
          } else {
            if(listIterator.hasNext()) {
              System.out.println("Now replaying " + listIterator.next());
              forward = true;
            } else {
              System.out.println("We have reached the end of the l");
            }
          }
          break;
        case 4:
          printList(playList);
          break;
        case 5:
          printMenu();
          break;
        case 6:
          if(playList.size() > 0) {
            listIterator.remove();
          } if (listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next());
          } else if (listIterator.hasPrevious()) {
            System.out.println("Now playing " + listIterator.previous());
          }
      }
    }
  }

  private static void printMenu() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - Quit");
    System.out.println("\t 1 - Next song");
    System.out.println("\t 2 - Previous song");
    System.out.println("\t 3 - Replay current song");
    System.out.println("\t 4 - List all songs in playlist");
    System.out.println("\t 5 - Print menu");
    System.out.println("\t 6 - Delete current song");
  }

  private static void printList(LinkedList<Song> playList) {
    Iterator<Song> i = playList.iterator();
    System.out.println("Songs in this playlist: ");
    while(i.hasNext()) {
      System.out.println(i.next());
    }
    System.out.println("=========");
  }
}
