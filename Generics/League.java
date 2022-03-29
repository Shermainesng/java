package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
  public String name;
  private ArrayList<T> league = new ArrayList<>();

  public League(String name) {
    this.name = name;
  }

  //can only add teams of the same type (football) to the same league
  public boolean add(T team) {
    if(league.contains(team)) {
      System.out.println(team.getName() + " is already in the league");
      return false;
    }
    league.add(team);
    System.out.println(team.getName() + " is now added to the league");
    return true;
  }

  public void showLeagueTable() {
    Collections.sort(league); //we are using the compareTo method that we override in Team class
    for(T team : league) {
      System.out.println(team.getName() + ": " + team.ranking());
    }
  }

}
