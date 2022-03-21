package OOP;

import java.util.prefs.BackingStoreException;

import javax.sound.sampled.SourceDataLine;

public class Main {
  public static void main(String[] args) {
    //CAR OBJECTS
    Car porsche = new Car(); //initialize a new object based on the Car class
    porsche.setModel("911");
    System.out.println("Model is " + porsche.getModel());

    //SIMPLECALCULATOR CLASS OBJECTS
    SimpleCalculator calculator = new SimpleCalculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("Addition result: " + calculator.getAdditionResult());
    System.out.println("Multiplication result: " + calculator.getMultiplicationResult());

    //PERSON CLASS OBJECTS
    Person person = new Person();
    person.setFirstName("");
    person.setLastName("");
    person.setAge(10);
    System.out.println("fullName = " + person.getFullName());
    System.out.println("person is teen? " + person.isTeen());
    person.setFirstName("sher");
    System.out.println("fullName= " + person.getFullName());

    //BANK ACCOUNT OBJECTS
    //creating a new object and calling the constructor and passing in values to it
    BankAccount bank = new BankAccount(1400, 49.00, "Bobby", "sher@sher.com");
    bank.depositFunds(100);
    System.out.println("Now i have " + bank.getBalance());
    System.out.println("my bank number: " + bank.getNumber());
    bank.withdrawFunds(120);
    System.out.println("now i have " + bank.getBalance());
    //calling the constructor with default values
    BankAccount bankDefault = new BankAccount("Tim", "tim@gmail.com");
    System.out.println(bankDefault.getNumber());

    //VIPCUSTOMER OBJECTS
    //calling the first constructor
    VipCustomer defaultAcct = new VipCustomer();
    System.out.println("Default account details: " + defaultAcct.getName() + defaultAcct.getCreditLimit());
    //calling the second constructor
    VipCustomer alex = new VipCustomer("Alex", "alex@gmail.com");
    System.out.println("Alex's account: " + alex.getCreditLimit() + alex.getEmailAddress());
  }
}
