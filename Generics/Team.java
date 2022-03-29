package Generics;

import java.util.ArrayList;

//player is the upper bound of T
//bounded type parameter
public class Team<T extends Player> implements Comparable<Team<T>>{
// public class Team<T extends Player & Coach & Manager> - for multiple class types
  private String name;
  int played = 0;
  int won = 0;
  int lost = 0;
  int tied = 0;

  public ArrayList<T> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean addPlayer(T player) {
    if(members.contains(player)) {
      System.out.println(((Player) player).getName() + " is already in " + this.name);
      //can get rid of the (Player) casting since we have specified the upper bound of t extends from Player
      return false;
    } else {
      members.add(player);
      System.out.println(((Player) player).getName() + " is now in " + this.name);
      return true;
    }
  }

  public int numPlayers() {
    return this.members.size();
  }

  public void results(Team<T> opponent, int ourScore, int theirScore) {

    String message;

    if (ourScore > theirScore) {
      won++;
      message = " beat ";
    } else if (ourScore == theirScore) {
      tied++;
      message = " drew with ";
    } else {
      lost++;
      message = " lost to ";
    }
    played++;
    //update team's scores too
    if(opponent != null) {
      System.out.println(this.getName() + message + opponent.getName());
      opponent.results(null, theirScore, ourScore);
    }
  }

  public int ranking() {
    return (won * 2) + tied;
  }

  //overrides the comparable interface
  @Override
  // compare to takes in a Team object of a certain type - can control the type of teams that are compared
  //only teams of same types can be compared
  public int compareTo(Team<T> team) {
    if (this.ranking() > team.ranking()) {
      return -1;
    } else if(this.ranking() < team.ranking()) {
      return 1;
    } else {
      return 0;
    }
  }
}
