package Array;

public class Arrays {
  public static void main(String[] args) {
    int[] myIntArray = new int[10];
    // myIntArray[5] = 50; //accessing the 6th element in the array

    for(int i=0; i<myIntArray.length; i++) {
      myIntArray[i] = i*10;
    }
    printArray(myIntArray);
    //INITIALIZING ARRAYS
    // int[] mySecondArray = { 1,2,3,4,5,6,7,8};
    //array = new int[] {1,2,3,4,5};
    // double[] myDoubleArray = new double[10];
  }

  public static void printArray(int[] array) {
    for (int i=0; i<10; i++) {
      System.out.println("Element " + i + ", value is " + array[i]);
    }
  }
}
