package Array;

import java.util.Scanner;

public class Average {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int[] myIntegers = getIntegers(5);
    for(int i=0; i<myIntegers.length; i++) {
      System.out.println("Element " + i + " has value of " + myIntegers[i]);
    }
    System.out.println("The average of valuesin your array is " + getAverage(myIntegers));
  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " values:\r");
    int[] values = new int[number]; //new array called 'values' with 5 integers

    for(int i=0; i<values.length; i++) {
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static double getAverage(int[] array) {
    int sum = 0;
    for (int i=0; i<array.length; i++) {
      sum += array[i];
    }
    return (double) sum / (double) array.length;
  }

}
