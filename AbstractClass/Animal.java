package AbstractClass;

//forcing the classes that are inheriting this class to implement from this abstract class
public abstract class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  //classes must implement these abstract methods
  public abstract void eat();
  public abstract void breathe();

  public String getName() {
    return name;
  }
}

//different from interfaces!
 //can add regular methods/constructors
