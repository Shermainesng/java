package Polymorphism;

public class Car {
  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.wheels = 4;
    this.engine = true;
  }

  public int getCylinders() {
    return cylinders;
  }
  public String getName() {
    return name;
  }

  public String startEngine() {
    return "Car -> startEngine";
  }
  public String accelerate() {
    return "Car -> accelerate";
  }
  public String brake() {
    return "Car -> brake";
  }
}

//SUB CLASS 1
class Tesla extends Car {
  public Tesla(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return "Tesla -> startEngine";
  }
  @Override
  public String accelerate() {
    return "Tesla -> accelerate";
  }
  @Override
  public String brake() {
    return "Tesla -> brake";
  }
}

//SUB CLASS 2
class Ford extends Car {
  public Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return "Ford -> startEngine";
    // return getClass().getSimpleName() + " ->  startEngine"; //methods from the object class
  }
  @Override
  public String accelerate() {
    return "Ford -> accelerate";
  }
  @Override
  public String brake() {
    return "Ford -> brake";
  }
}
