package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();
    // placesToVisit.add("Croatia");
    // placesToVisit.add("Denmark");
    // placesToVisit.add("Bali");
    // placesToVisit.add(1, "Brisbane");
    // placesToVisit.remove(2);

    addInOrder(placesToVisit, "Croatia");
    addInOrder(placesToVisit, "Amsterdam");
    addInOrder(placesToVisit, "Bali");
    addInOrder(placesToVisit, "Denmark");

    printList(placesToVisit);
    visit(placesToVisit);

  }
  public static void printList(LinkedList<String> linkedList) {
    Iterator<String> i = linkedList.iterator();
    //while node is pointing to another node, print it out
    while(i.hasNext()) {
      System.out.println("Now visiting " + i.next());
    }
    System.out.println("=========");
  }

  //add a new city and sort it by alphabetical order
  public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
    //ListIterator is more flexible than iterator, is used when we have to insert records etc
    ListIterator<String> stringListIterator = linkedList.listIterator();

    //.next() returns the current node, then moves to next entry automatically
    //stringListIterator.next() to refer to the first record
    while(stringListIterator.hasNext()){
      int comparison = stringListIterator.next().compareTo(newCity);
      if(comparison == 0) {
        //equal, do not add newCity in the list
        System.out.println(newCity + " is already included in the list");
        return false;
      } else if (comparison > 0) {
        //Brisbane -> Croatia -> Russia // newCity = "Amsterdam"
        //Brisbane compare to Amsterdam -> newCity should be before Croatia
        //But pointer moves on to Croatia automatically
        stringListIterator.previous(); //go back
        stringListIterator.add(newCity); //add city to before Croatia
        return true;
      } else if (comparison < 0) {
        //move to the next city
        //newCity comes after current city
      }
    }
    stringListIterator.add(newCity); //add the city to the back of the list
    return true;
  }

  //a menu so users can go forwards or backwards in the doubly linked list
  private static void visit(LinkedList<String> cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<String> listIterator = cities.listIterator();

    if(cities.isEmpty()) {
      System.out.println("No cities in the itinerary");
      return;
    } else {
      System.out.println("Now visiting " + listIterator.next());
      printMenu();
    }
    while(!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch(action) {
        case 0:
          System.out.println("Ended holiday");
          quit = true;
          break;
        case 1: //going forward
          if(!goingForward) { //if cursor is pointing backwards currently
            if(listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }
          if(listIterator.hasNext()) {
            System.out.println("Now visiting " + listIterator.next());
          } else {
            System.out.println("Reached the end of the list");
            goingForward = false;
          }
          break;
        case 2: //go backwards
          //is direction is currently going forward, set the pointer to the previous one so it doesn't repeat twice
          if(goingForward) {
            if(listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }
          if(listIterator.hasPrevious()) {
            System.out.println("Going back to " + listIterator.previous());
          } else {
            System.out.println("This is the first country in the list");
            goingForward = true;
          }
          break;
        case 3:
          printMenu();
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - End holiday");
    System.out.println("\t 1 - Visit next country");
    System.out.println("\t 2 - Go back to previous country");
    System.out.println("\t 3 - To print menu");
  }
}
