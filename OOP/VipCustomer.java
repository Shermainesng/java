package OOP;

public class VipCustomer {
  private String name;
  private double creditLimit;
  private String emailAddress;

  //constructor 1 (default values)
  public VipCustomer() {
    this("Default User", 500.00, "user@gmail.com");
  }
  //constructor 2 (receives 2 values, 1 default)
  public VipCustomer(String name, String emailAddress) {
    this(name, 500.00, emailAddress);
  }
  //constructor 3 (save all fields)
  public VipCustomer(String name, double creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
  }
  //getters
  public String getName() {
    return this.name;
  }
  public double getCreditLimit() {
    return this.creditLimit;
  }
  public String getEmailAddress() {
    return this.emailAddress;
  }
}
