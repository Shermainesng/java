package Interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  //   //Class: DESKPHONE, Interface: ITelephone
  //   ITelephone shersPhone; //defining the interface type - abstract
  //   shersPhone = new DeskPhone(123456);
  //   shersPhone.powerOn();

  //   //Class: MOBILEPHONE, Interface: ITelephone
  //   shersPhone = new MobilePhone(243); //can create new objects of different classes by specifying the interface
  //   shersPhone.callPhone(34124);
  //   shersPhone.answer();


    // Class: PLAYER, Interface: ISaveable
    // Player charles = new Player("Charles", 100, 100);
    // System.out.println(charles); //we don't have to specify @override toString() method
    // saveObject(charles); //charles is a Isaveable object as it comes from player class that implemented Isaveable

    // //using setters to update data
    // charles.setHitPoints(50);
    // charles.setStrength(50);
    // System.out.println(charles); //50

    // //using .readValues() to get user's input and .loadObject() to update values
    // loadObject(charles);
    // System.out.println(charles);

    // Class: MONSTER, Interface: Isaveable
    ISaveable bigEye = new Monster("fuzzy", 100, 100); //better to instantiate a new Monster object using the interface
    System.out.println(bigEye);
    System.out.println(((Monster) bigEye).getStrength());


    loadObject(bigEye);
    System.out.println(bigEye);
  }

  //method that prompts users to fill in fields, then puts data in an array list
  public static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int index = 0;
    System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

    while(!quit) {
      System.out.println("Choose an option");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
        case 0:
          quit = true;
          break;
        case 1:
          System.out.println("Enter a string: ");
          String stringInput = scanner.nextLine();
          values.add(index, stringInput); //populating the array list with strings
          index++;
          break;
      }
    }
    return values;
  }

  //method that takes an object that implements the interface as a parameter and tells users that the values are being saved
  //can use any object that has implemented that interface
  public static void saveObject(ISaveable objectToSave) {
    //uses .write to go through the entire list and 'saves'each data
    //objectToSave.write() is the ArrayList that is created
    for (int i=0; i<objectToSave.write().size(); i++) {
      System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
    }
  }

  //method that takes the values that user keys in the update the actual object
  public static void loadObject(ISaveable objectToLoad) {
    ArrayList<String> values = readValues(); //values that user keys in
    objectToLoad.read(values); //passes the arraylist of values to populate the fields
  }
}
