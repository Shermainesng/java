package Array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrays {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] myIntegers = getIntegers(5);
    int[] sortedArray = sortIntegers(myIntegers);
    printArray(sortedArray);
  }


  private static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " values:\r");
    int[] array = new int[number];

    for(int i=0; i<array.length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  private static void printArray(int[] array) {
    for(int i=0; i<array.length; i++) {
      System.out.println("Element " + i + " has value of " + array[i]);
    }
  }

  private static int[] sortIntegers(int[] array) {
    //duplicate the array - can use:
    //int[] sortedArray = Arrays.copyOf(array, array.length);
    int[] sortedArray = new int[array.length];
    for(int i=0; i<array.length; i++) {
      sortedArray[i] = array[i];
    }
    boolean flag = true;
    int temp;
    while(flag) {
      flag = false;
      for(int i=0; i<sortedArray.length - 1; i++) {
        if(sortedArray[i] < sortedArray[i+1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }
    return sortedArray;
  }

}
