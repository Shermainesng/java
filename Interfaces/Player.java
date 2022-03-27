package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
  private String name;
  private int hitPoints;
  private int strength;
  private String weapon;

  public Player(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.weapon = "Sword";
  }

  public String getName() {
    return name;
  }
  public int getHitPoints() {
    return hitPoints;
  }
  public int getStrength() {
    return strength;
  }
  public String getWeapon() {
    return weapon;
  }

  public void setHitPoints(int points) {
    this.hitPoints = points;
  }
  public void setStrength(int strength) {
    this.strength = strength;
  }

  @Override
  public String toString() {
    return "{Player's name: " + name +
    " ,hitpoints: " + hitPoints +
    " ,strength: " + strength +
    " , weapon: " + weapon + " }";
  }

  public List<String> write() {
    List<String> values = new ArrayList<String>(); //use List as it gives us some flexibility - we can inherit the List methods from interface but use any types of list in our classes
    values.add(0, this.name);
    values.add(1, "" + this.hitPoints);
    values.add(2, "" + this.strength);
    values.add(3, this.weapon);
    return values;
  }

  //populating fields
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0) {
      this.name = savedValues.get(0);
      this.hitPoints = Integer.parseInt(savedValues.get(1));
      this.strength = Integer.parseInt(savedValues.get(2));
      this.weapon = savedValues.get(3);
    }
  }
}
