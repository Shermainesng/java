package Array;

import java.util.Scanner;

public class TestPhone {
  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone mobilePhone = new MobilePhone("83327050");

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(!quit) {
      System.out.println("Starting phone...what do you want to do? ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          mobilePhone.printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          modifyContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          queryContact();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print all your contacts");
    System.out.println("\t 2 - To add a new contact");
    System.out.println("\t 3 - To update an existing contact");
    System.out.println("\t 4 - To remove a contact");
    System.out.println("\t 5 - To check if a contact exists");
    System.out.println("\t 6 - To quit the application");
  }

  public static void addContact() {
    System.out.println("Enter name of contact: ");
    String name = scanner.nextLine();
    System.out.println("Enter phone number: ");
    String phoneNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(name, phoneNumber);
    if (mobilePhone.addNewContact(newContact)) {
      System.out.println("New contact added!");
    } else {
      System.out.println("Contact is already on file");
    }
  }

  public static void modifyContact() {
    System.out.println("Enter name of contact you want to update: ");
    String oldName = scanner.nextLine();
    System.out.println("Enter updated name: ");
    String newName = scanner.nextLine();
    System.out.println("Enter new number:");
    String newNumber= scanner.nextLine();


    Contact oldContact = mobilePhone.queryContact(oldName);
    if(oldContact == null) {
      System.out.println("Contact not found");
      return;
    }
    Contact updatedContact = Contact.createContact(newName, newNumber);
    if(mobilePhone.modifyContact(oldContact, updatedContact)) {
      System.out.println("successfully updated record!");
    } else {
      System.out.println("error updating record");
    }
  }

  public static void removeContact() {
    System.out.println("Enter name of contact to remove: ");
    String nameToRemove = scanner.nextLine();
    Contact contactToRemove = mobilePhone.queryContact(nameToRemove);
    if (contactToRemove == null) {
      System.out.println("contact not found");
      return;
    }
    if (mobilePhone.removeContact(contactToRemove)) {
      System.out.println(contactToRemove.getName() + " is removed");
    } else {
      System.out.println("contact can't be removed");
    }
  }

  public static void queryContact() {
    System.out.println("Enter name of contact you want to find: ");
    String nameToQuery = scanner.nextLine();
    Contact contactToQuery = mobilePhone.queryContact(nameToQuery);
    if(mobilePhone.queryContact(contactToQuery)) {
      System.out.println("Contact is in your phone");
    } else {
      System.out.println("contact does not exist");
    }
  }
}
