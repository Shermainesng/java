package ArrayList;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>(); //string data will be in this arraylist

  //getter
  public ArrayList<String> getGroceryList() {
    return groceryList;
  }

  public void addGroceryItem(String item) {
    groceryList.add(item);
  }

  public void printGroceryList() {
    System.out.println("you have " + groceryList.size() + " items in your grocery list");
    for (int i=0; i<groceryList.size();i++) {
      System.out.println((i+1) + ". " + groceryList.get(i));
    }
  }

  //user keys in name of item to modify
  public void modifyGroceryItem(String currentItem, String newItem) {
    int position = findItem(currentItem);
    if(position >= 0) {
      modifyGroceryItem(position, newItem);
    }
  }
  private void modifyGroceryItem(int position, String newItem) {
    groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position + 1) + " has been modified");
  }

  //user keys in name of item to remove
  public void removeGroceryItem(String item) {
    int position = findItem(item);
    if(position >= 0) {
      removeGroceryItem(position);
    }
  }

  private void removeGroceryItem(int position) {
    String theItem = groceryList.get(position);
    groceryList.remove(position);
  }

  private int findItem(String searchItem) {
    // boolean exists = groceryList.contains(searchItem);
      return groceryList.indexOf(searchItem);
  }

  public boolean onFile(String searchItem) {
    int position = findItem(searchItem);
    if (position >= 0) {
      return true;
    }
    return false;
  }
}
