package ArrayList;
import java.util.ArrayList;


public class MobilePhone {
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  //PRINT ALL CONTACTS
  public void printContacts() {
    System.out.println("you have " + this.myContacts.size() + " contacts");
    for (int i=0; i<this.myContacts.size();i++) {
      System.out.println((i+1) + ". Name: " + this.myContacts.get(i).getName() + " Number: " + this.myContacts.get(i).getPhoneNumber());
    }
  }

  //ADD NEW CONTACT
  public boolean addNewContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("name already exists");
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  //UPDATE CONTACT (don't allow contacts with the same name)
  public boolean modifyContact(Contact oldContact, Contact newContact) {
    int indexOfContact = findContact(oldContact);
    if(indexOfContact < 0) {
      return false;
    } else if (findContact(newContact.getName()) != -1) { //new name should return -1
      System.out.println("contact with name " + newContact.getName() + " already exists");
      return false;
    }
    this.myContacts.set(indexOfContact, newContact);
    return true;
  }

  //QUERY CONTACT
  public Contact queryContact(String name) {
    int index = findContact(name);
    if (index >= 0) {
      Contact contact = this.myContacts.get(index);
      return contact;
    }
    return null;
  }

  public boolean queryContact(Contact contact) {
    if(findContact(contact) >= 0) {
      return true;
    }
    return false;
  }

  //REMOVE CONTACT
  public boolean removeContact(Contact contact) {
    int indexToRemove = findContact(contact);
    if (indexToRemove >= 0) {
      myContacts.remove(contact);
      return true;
    } else {
      return false;
    }
  }

  //return the index of a contact
  private int findContact(Contact contact) {
    return this.myContacts.indexOf(contact);
  }

  //return the index of a name - iterate through our contact list, extract the name out and compare it to our param name and return the index
  private int findContact(String contactName) {
    for(int i=0; i<this.myContacts.size();i++) {
      Contact contact = this.myContacts.get(i); //creating contact instances with our current contact list
      if (contact.getName().equals(contactName)) {
        return i; //the index of that record in the list
      }
    }
    return -1;
  }
}
