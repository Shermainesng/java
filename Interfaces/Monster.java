package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
  private String name;
  private int hitPoints;
  private int strength;
  private String feature;

  public Monster(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.feature = "Claw";
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
  public String getFeature() {
    return feature;
  }

  public void setHitPoints(int points) {
    this.hitPoints = points;
  }
  public void setStrength(int strength) {
    this.strength = strength;
  }

  @Override
  public String toString() {
    return "{Monster's name: " + name +
    " ,hitpoints: " + hitPoints +
    " ,strength: " + strength +
    " , feature: " + feature + " }";
  }

  public List<String> write() {
    List<String> values = new ArrayList<String>(); //use List as it gives us some flexibility - we can inherit the List methods from interface but use any types of list in our classes
    values.add(0, this.name);
    values.add(1, "" + this.hitPoints);
    values.add(2, "" + this.strength);
    values.add(3, this.feature);
    return values;
  }

  //populating fields
  public void read(List<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0 && savedValues.size() <= 3) {
      this.name = savedValues.get(0);
      this.hitPoints = Integer.parseInt(savedValues.get(1));
      this.strength = Integer.parseInt(savedValues.get(2));
      this.feature = "claw";
    } else {
      this.name = savedValues.get(0);
      this.hitPoints = Integer.parseInt(savedValues.get(1));
      this.strength = Integer.parseInt(savedValues.get(2));
      this.feature = savedValues.get(3);
    }
  }
}
