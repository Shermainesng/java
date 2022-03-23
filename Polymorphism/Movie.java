package Polymorphism;

//BASE CLASS
public class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String plot() {
    return "No plot here";
  }

  public String getName() {
    return name;
  }
}

//CHILD CLASS 1
class Jaws extends Movie {
  public Jaws() {
    super("Jaws");
  }
  public String plot() {
    return "A shark eats lots of people";
  }
}

//CHILD CLASS 2
class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  @Override
  public String plot() {
    return "Aliens attempt to take over earth";
  }
}

//CHILD CLASS 3
class MazeRunner extends Movie {
  public MazeRunner() {
    super("Maze Runner");
  }

  @Override
  public String plot() {
    return "kids try to escape a maze";
  }
}

//CHILD CLASS 4
class Forgettable extends Movie {
  public Forgettable() {
    super("Forgettable");
  }
}
