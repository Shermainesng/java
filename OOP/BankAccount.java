package OOP;

public class BankAccount {
  private int number;
  private double balance;
  private String customerName;
  private String email;
  //CONSTRUCTOR
  //constructor which sets default values when i call this
  public BankAccount() {
    this(9999, 2.50, "default name", "default address"); //default setting - calling another constructor within a constructor
  }
  //constructor that i can pass values to
  public BankAccount(int number, double balance, String customerName, String email) {
    this.number = number;
    this.balance = balance;
    // setBalance(balance); //can use this, but might be problematic as it might not be initialized
    this.customerName = customerName;
    this.email = email;
  }
  //constructor with some defaults
  public BankAccount(String customerName, String email) {
    this(9999, 100.55, customerName, email);
  }

  //Getters
  public double getBalance() {
    return balance;
  }
  public int getNumber() {
    return number;
  }

  //setters
  public void setBalance(double balance) {
    this.balance = balance;
  }

  //other methods
  public void depositFunds(double deposit) {
    this.balance += deposit;
  }

  public void withdrawFunds(double withdrawal) {
    if (this.balance < withdrawal) {
      System.out.println("you only have " + this.balance + " left");
    } else {
      this.balance -= withdrawal;
    }
  }
}
