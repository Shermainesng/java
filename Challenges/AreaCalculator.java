package Challenges;

public class AreaCalculator {
  public static void main(String[] args) {
    System.out.println(area(5));
    System.out.println(area(3,4));
    printYearsAndDays(525600);
    printEqual(1, 1, 1);
    printEqual(1, 2, 3);
    System.out.println(isCatPlaying(true, 10));
    System.out.println(isCatPlaying(false, 35));
  }

  public static double area(double radius) {
    if (radius < 0) {
      return -1.0;
    }
    double circleArea = radius * radius * Math.PI;
    return circleArea;
  }

  public static double area(double x, double y) {
    if (x < 0 || y < 0) {
      return -1.0;
    }
    double rectangleArea = x * y;
    return rectangleArea;
  }

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
    } else {
      long hours = minutes / 60;
      long days = hours / 24;
      long years = days / 365;
      long remainingDays = days % 365;
      System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
  }

  public static void printEqual(int valueOne, int valueTwo, int valueThree) {
    if (valueOne < 0 || valueTwo < 0 || valueThree < 0) {
      System.out.println("Invalid Value");
    } else if (valueOne == valueTwo && valueTwo == valueThree) {
      System.out.println("All numbers are equal");
    } else if (valueOne != valueTwo && valueTwo != valueThree && valueOne != valueThree) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither all are equal or different");
    }
  }

  public static boolean isCatPlaying(boolean summer, int temperature) {
    if (!summer && temperature >= 25 && temperature <= 35) {
      return true;
    } else if (summer && temperature >=25 && temperature <= 45) {
      return true;
    } else {
      return false;
    }
  }
}
