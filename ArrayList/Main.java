package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  //GROCERYLIST CLASS
  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(!quit) {
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          groceryList.printGroceryList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchForItem();
          break;
        case 6:
          processArrayList();
        case 7:
          quit = true;
          break;
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of grocery items");
    System.out.println("\t 2 - To add an item to the list");
    System.out.println("\t 3 - To modify an item in the list");
    System.out.println("\t 4 - To remove an item from the list");
    System.out.println("\t 5 - To search for an item in the list");
    System.out.println("\t 6 - To save your list");
    System.out.println("\t 7 - To quit the application");
  }
  public static void addItem() {
    System.out.println("Please enter the grocery item: ");
    groceryList.addGroceryItem(scanner.nextLine()); //using the class method
  }

  public static void modifyItem() {
    System.out.println("Enter item to modify: ");
    String itemToModify = scanner.nextLine();
    System.out.println("Enter replacement item: ");
    String newItem = scanner.nextLine();
    groceryList.modifyGroceryItem(itemToModify, newItem);
  }

  public static void removeItem() {
    System.out.println("Enter item to remove: ");
    String itemToRemove = scanner.nextLine();
    groceryList.removeGroceryItem(itemToRemove);
  }
  public static void searchForItem() {
    System.out.println("Enter item you want to find: ");
    String itemToFind = scanner.nextLine();
    if (groceryList.onFile(itemToFind)) {
      System.out.println("Found " + itemToFind + " in our grocery list");
    } else {
      System.out.println(itemToFind + " is not in the shopping list");
    }
  }

  //save the array
  public static void processArrayList() {
    ArrayList<String> newArray = new ArrayList<String>();
    newArray.addAll(groceryList.getGroceryList());
    // ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

    //save the arraylist into a regular array
    String[] myArray = new String[groceryList.getGroceryList().size()]; //initializing the string array
    myArray = groceryList.getGroceryList().toArray(myArray);
  }
}
