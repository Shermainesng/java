package Polymorphism;

public class Hamburger {
  private String name;
  private String breadRollType;
  private String meatType;
  private double price;

  private String addition1Name;
  private double addition1Price;
  private String addition2Name;
  private double addition2Price;
  private String addition3Name;
  private double addition3Price;
  private String addition4Name;
  private double addition4Price;

  public Hamburger(String name, String breadRollType, String meatType, int price) {
    this.name = name;
    this.breadRollType = breadRollType;
    this.meatType = meatType;
    this.price = price;
  }

  //METHODS FOR ADDING TOPPINGS
  public void addHamburgerAddition1(String name, double price) {
    this.addition1Name = name;
    this.addition1Price = price;
  }
  public void addHamburgerAddition2(String name, double price) {
    this.addition2Name = name;
    this.addition2Price = price;
  }
  public void addHamburgerAddition3(String name, double price) {
    this.addition3Name = name;
    this.addition3Price = price;
  }
  public void addHamburgerAddition4(String name, double price) {
    this.addition4Name = name;
    this.addition4Price = price;
  }
  //calculate the total price depending on how many additions have been added
  public double itemizeHamburger() {
    double hamburgerPrice = this.price; //og base price
    if (this.addition1Name != null) {
      hamburgerPrice += this.addition1Price;
      System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
    }
    if (this.addition2Name != null) {
      hamburgerPrice += this.addition2Price;
      System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
    }
    if (this.addition3Name != null) {
      hamburgerPrice += this.addition3Price;
      System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
    }
    if (this.addition4Name != null) {
      hamburgerPrice += this.addition4Price;
      System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
    }
    return hamburgerPrice;
  }

  public void getOrder() {
    System.out.println("Your order is: " + name + " with " + breadRollType + " with " + meatType + " for: " + price);
  }

}

//SUB CLASS 1 - CAN ADD 2 EXTRA CATEGORIES OF TOPPINGS
class HealthyBurger extends Hamburger {
  private String healthyExtra1Name;
  private double healthyExtra1Price;

  private String healthyExtra2Name;
  private double healthyExtra2Price;

  public HealthyBurger(String meatType, int price) {
    super("Healthy Burger", "Brown Rye", meatType, price);
  }

  //extra topping
  public void addHealthyExtra1(String name, double price) {
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
  }
  public void addHealthyExtra2(String name, double price) {
    this.healthyExtra2Name = name;
    this.healthyExtra2Price = price;
  }

  @Override
  public double itemizeHamburger() {
    double hamburgerPrice = super.itemizeHamburger(); //only covers the 4 toppings in the base class
    if (this.healthyExtra1Name != null) {
      hamburgerPrice += this.healthyExtra1Price;
      System.out.println("Added " + this.healthyExtra1Name + " for " + this.healthyExtra1Price);
    }
    if (this.healthyExtra2Name != null) {
      hamburgerPrice += this.healthyExtra2Price;
      System.out.println("Added " + this.healthyExtra2Name + " for " + this.healthyExtra2Price);

    }
    return hamburgerPrice;
  }
}

//SUB CLASS - ADDS 2 TOPPINGS AUTOMATICALLY BUT CANNOT ADD ANYMORE
class DeluxeBurger extends Hamburger {

  public DeluxeBurger() {
    super("Deluxe burger", "brioche", "beef", 15);
    super.addHamburgerAddition1("Chips", 1.80);
    super.addHamburgerAddition2("Drink", 2.80);
  }

  @Override
  public void addHamburgerAddition1(String name, double price) {
    System.out.println("Cannot allow additional items to be added");
  }
  @Override
  public void addHamburgerAddition2(String name, double price) {
    System.out.println("Cannot allow additional items to be added");
  }
  @Override
  public void addHamburgerAddition3(String name, double price) {
    System.out.println("Cannot allow additional items to be added");
  }
  @Override
  public void addHamburgerAddition4(String name, double price) {
    System.out.println("Cannot allow additional items to be added");
  }
}
