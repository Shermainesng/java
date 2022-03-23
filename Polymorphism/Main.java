package Polymorphism;

public class Main {

  //MOVIE
  // public static void main(String[] args) {
  //   for (int i=1; i<11; i++) {
  //     Movie movie = randomMovie();
  //     System.out.println("Movie #" + i + " " + movie.getName() + "\n" + "Plot: " + movie.plot());
  //   }
  // }

  // public static Movie randomMovie() {
  //   int randomNumber = (int) (Math.random() * 5); //returns a number 0-1
  //   System.out.println(randomNumber);
  //   switch (randomNumber) {
  //     case 1:
  //       return new Jaws();
  //     case 2:
  //       return new IndependenceDay();
  //     case 3:
  //       return new MazeRunner();
  //     case 4:
  //       return new Forgettable();
  //     default:
  //       return null;
  //   }
  // }

  // //CAR
  // public static void main(String[] args) {
  //   Car car = new Car(8, "Base car");
  //   System.out.println(car.startEngine());

  //   Tesla tesla = new Tesla(6, "sher's car");
  //   System.out.println(tesla.startEngine());
  // }

  //HAMBURGER
  public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("cheeseburger", "brioche", "beef", 3);
    hamburger.getOrder();
    hamburger.addHamburgerAddition1("lettuce", 0.80);
    System.out.println(hamburger.itemizeHamburger());

    HealthyBurger healthyBurger = new HealthyBurger("imposible", 6);
    healthyBurger.getOrder();
    healthyBurger.addHamburgerAddition1("lettuce", 0.80);
    healthyBurger.addHealthyExtra1("organic beets", 2);
    System.out.println(healthyBurger.itemizeHamburger());

    DeluxeBurger db = new DeluxeBurger();
    db.getOrder();
    db.addHamburgerAddition1("lettuce", 0.80);
  }
}
