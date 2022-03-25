package ArrayList;

import java.util.ArrayList;

public class Branch {

  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<Customer>();
  }

  //getters
  public String getName() {
    return name;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  //CREATE - new customer & transaction
  public boolean newCustomer(String customerName, double initialTransaction) {
    if (findCustomer(customerName) == null) {
      this.customers.add(new Customer(customerName, initialTransaction));
      return true;
    }
    return false;
  }

  public boolean addCustomerTransaction(String customerName, double amount) {
    Customer existingCustomer = findCustomer(customerName);
    if(findCustomer(customerName) != null) {
      existingCustomer.addTransaction(amount);
      return true;
    }
    return false;
  }

  private Customer findCustomer(String customerName) {
    for(int i=0; i<this.customers.size();i++) {
      Customer customer = this.customers.get(i);
      if(customer.getName() == customerName) {
        return customer;
      }
    }
    return null;
  }
}
