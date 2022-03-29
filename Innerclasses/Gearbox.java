package Innerclasses;

import java.util.ArrayList;

public class Gearbox {
  private ArrayList<Gear> gears;
  private int maxGears;
  private int currentGear = 0;
  private boolean clutchIsIn;

  public Gearbox(int maxGears) {
    this.maxGears = maxGears;
    this.gears = new ArrayList<>();
    Gear neutral = new Gear(0, 0.0); //default gear
    this.gears.add(neutral);
  }

  public void operateClutch(boolean in) {
    this.clutchIsIn = in;
  }

  public void addGear(int gearNumber, double ratio) {
    if(gearNumber > 0 && gearNumber <= maxGears) {
      this.gears.add(new Gear(gearNumber, ratio));
    }
  }

  public void changeGear(int gearNumber) {
    if (gearNumber > 0 && gearNumber < this.gears.size() && this.clutchIsIn) {
      this.currentGear = gearNumber;
      System.out.println("Gear " + gearNumber + " selected");
    } else {
      System.out.println("Grind");
      this.currentGear = 0;
    }
  }

  public double wheelSpeed(int revs) {
    if (clutchIsIn) {
      System.out.println("Scream");
      return 0.0;
    }
    return revs * gears.get(currentGear).getRatio();
  }

  //INNERCLASS - we don't want public to access this - create a gear through the gearbox instead
  private class Gear {
    private int gearNumber;
    private double ratio;

    public Gear(int gearNumber, double ratio) {
      this.gearNumber = gearNumber;
      this.ratio = ratio;
    }

    public double getRatio() {
      return ratio;
    }

    public double driveSpeed(int revs) {
      return revs * (this.ratio);
    }
  }
}
