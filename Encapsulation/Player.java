package Encapsulation;

public class Player {
  //variables are private so can't be changeable from outside this class
  private String name;
  private int health = 100; //default value
  private String weapon;

  public Player(String name, int health, String weapon) {
    this.name = name;
    if (health > 0 && health <= 100) {
      this.health = health;
    }
    this.weapon = weapon;
  }

  public void loseHealth(int damage) {
    this.health = this.health - damage;
    if (this.health <= 0) {
      System.out.println("your health is now " + health);
    }
  }

}
