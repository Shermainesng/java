package Array;

import java.util.Scanner;

public class MinimumElement {

  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter count: ");
    int count = scanner.nextInt();
    scanner.nextLine();

    int[] returnedArray = readIntegers(count);
    System.out.println("The minimum element is " + findMin(returnedArray));
  }

  public static int[] readIntegers(int count) {
    int[] array = new int[count];

    for (int i=0; i<array.length; i++) {
      System.out.println("Enter " + count + " values:\r");
      array[i] = scanner.nextInt();
      scanner.nextLine(); //to handle the enter key
    }
    return array;
  }

  public static int findMin(int[] array) {
    int minimumElement = Integer.MAX_VALUE;
    for(int i=0; i<array.length;i++) {
      if(array[i] < minimumElement) {
        minimumElement = array[i];
      }
    }
    return minimumElement;
  }
}
