package AbstractClass;

//abstract class itself is extending from another extract class
public abstract class Bird extends Animal implements CanFly {
  public Bird(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(getName() + " is pecking");
  }

  @Override
  public void breathe() {
    System.out.println(getName() + " is breathing");
  }

  @Override
  public void fly() {
    System.out.println("Bird class: " + getName() + " is flapping its wings");
  }
}
