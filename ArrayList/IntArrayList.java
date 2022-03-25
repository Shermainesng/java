package ArrayList;

import java.util.ArrayList;

public class IntArrayList {
  //array list can't be of primitive type, but a class (String is a class)
  public static void main(String[] args) {
    //Integer and Double are clases
    Integer integer = Integer.valueOf(54);
    Double doubleValue = Double.valueOf(12.25);

    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    //AUTOBOXING - converting a primitive type int into an Integer
    //filling up the array with 1-10
    for (int i=0; i<=10; i++) {
      intArrayList.add(Integer.valueOf(i));
    }

    //UNBOXING - converting the object back to a primitive type
    //print out the list
    for(int i=0; i<=10; i++) {
      System.out.println(i + " --> " + intArrayList.get(i).intValue());
    }

    //FASTER WAY FOR AUTOBOXING AND UNBOXING
    Integer myIntValue = 56; //instead of Integer.valueOf(56)
    int myInt = myIntValue; //myInt.intValue() - convert object to int

    //AUTOBOXING - DOUBLE
    ArrayList<Double> doubleArrayList = new ArrayList<Double>();
    for (double dbl=0.0; dbl<=10.0; dbl += 0.5) {
      doubleArrayList.add(Double.valueOf(dbl));
      // doubleArrayList.add(dbl);
      System.out.println(dbl);
    }

    //UNBOXING
    for(int i=0; i<doubleArrayList.size(); i++) {
      double value = doubleArrayList.get(i).intValue();
      System.out.println(i + "-> " + value);
    }
  }
}
