package Inheritance;

public class Dog extends Animal {
  //unique variables in addition to those that we have inherited from Animal
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  //constructor that calls the Animal class
  //super class is Animal class, and we inherit from it - extend from the base class
  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight); //set default for 2 of the base params
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  private void chew() {
    System.out.println("Dog.chew() called");
  }

  @Override
  public void eat() {
    System.out.println("Dog.eat() called");
    chew();
    super.eat();
  }
  public void walk() {
    System.out.println("Dog.walk() called");
    move(5); //calling the og methods from super class
  }
  public void run() {
    System.out.println("Dog.run() called");
    move(10); //execute the move method in this class. if its super.move(), it'll execute the Animal class's move()
  }
  private void moveLegs(int speed) {
    System.out.println("Dog.moveLegs() called");
  }
  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called");
    moveLegs(speed);
    super.move(speed);
  }
}
