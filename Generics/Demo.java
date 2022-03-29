package Generics;

import java.util.ArrayList;

public class Demo {
  public static void main(String[] args) {
    //specify the type <Integer>
    ArrayList<Integer> items = new ArrayList<>();
    items.add(1);
    items.add(2);
    items.add(3);

    printDoubled(items);
  }

  private static void printDoubled(ArrayList<Integer> n) {
    for (int i : n) {
      System.out.println(i * 2); // no need to cast (Integer) because arrayList has been specified
    }
  }
}
