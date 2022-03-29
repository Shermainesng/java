package AbstractClass;

public class Penguin extends Bird {
  public Penguin(String name) {
    super(name);
  }

  @Override
  public void fly() {
    super.fly();
    System.out.println("Penguin class: " + getName() + " can't fly");
  }
}
