package Composition;

public class Lamp {
  private String style;
  private boolean battery;
  private int globRating;

  public Lamp(String style, boolean battery, int globRating) {
    this.style = style;
    this.battery = battery;
    this.globRating = globRating;
  }

  //getters
  public String getStyle() {
    return style;
  }
  public boolean getIsBattery() {
    return battery;
  }
  public int getGlobRating() {
    return globRating;
  }

  //public methods
  public void turnOn() {
    System.out.println("LAMP class -> turnOn() ");
  }
}
