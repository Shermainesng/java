package Inheritance;

public class Main {
  public static void main(String[] args) {
    //ANIMAL OBJECTS - ANIMAL, DOG, FISH
    // Animal animal = new Animal("Default animal", 1,1,5,5);

    // Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky");
    // dog.eat(); //can use methods inherited from the Animal class
    // //with the override method in Dog.java, the flow is:
    // //- goes to the @override eat() method and runs all the code there
    // dog.run();

    //CIRCLE OBJECTS - CIRCLE AND CYLINDER
    Circle circle = new Circle(3.75);
    Cylinder cylinder = new Cylinder(5.55, 7.25);
    System.out.println(cylinder.getArea());
    System.out.println(cylinder.getVolume());
  }
}
