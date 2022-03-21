package ControlFlow;

import OOP.SimpleCalculator;

public class ParsingValuesFromString {
  public static void main(String[] args) {
    String numberAsString = "2018";
    System.out.println(numberAsString); //this is a string, not an int

    //PARSEINT
    int number = Integer.parseInt(numberAsString);
    System.out.println(number); //this is an int

    //PARSEDOUBLE
    String doubleString = "2018.126";
    double numberDouble = Double.parseDouble(doubleString);
    System.out.println(numberDouble);

    //TESTS
    System.out.println(canPack(2, 1, 5));
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }
    int sum = (bigCount * 5) + smallCount;
    int remainder = goal % 5;
    if (sum == goal) {
      return true;
    } else if (sum > goal && smallCount >= remainder) {
      return true;
    } else {
      return false;
    }
  }
}
