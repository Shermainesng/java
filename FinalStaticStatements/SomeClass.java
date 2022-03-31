package FinalStaticStatements;

public class SomeClass {

  private static int classCounter = 0; //static variable
  public final int instanceNumber;
  private final String name;

  public SomeClass(String name) {
    this.name = name;
    classCounter++;
    instanceNumber = classCounter; //an object's instanceNumber cannot be changed once the isntance is created (its final)
    System.out.println(name + " created, instance is " + instanceNumber);
  }

  public int getInstanceNumber() {
    return instanceNumber;
  }
}
