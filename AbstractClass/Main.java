package AbstractClass;

public class Main {
  public static void main(String[] args) {
    // Dog dog = new Dog("Yorkie");
    // dog.breathe();
    // dog.eat();

    // // Bird bird = new Bird("Parrot"); //we can't instantiate an abstract class. create a new class
    // // bird.breathe();
    // // bird.eat();

    // Parrot parrot = new Parrot("Australian ringneck");
    // parrot.breathe();
    // parrot.fly();

    // Penguin penguin = new Penguin("Emperor");
    // penguin.fly();

    //LINKEDLIST
    SearchTree listOne = new SearchTree(null);
    listOne.traverse(listOne.getRoot());

    String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
    // String stringData = "5 7 3 9 8 2 1 0 4 6";
    String[] data = stringData.split(" ");
    for (String s : data) {
      listOne.addItem(new Node(s));
    }
    listOne.traverse(listOne.getRoot());
  }
}
