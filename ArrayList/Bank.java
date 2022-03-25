package ArrayList;

import java.util.ArrayList;

public class Bank {

  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<Branch>();
  }

  //CREATE - new Branch, new Customer to a branch
  public boolean addNewBranch (String name) {
    if(findBranch(name) == null) {
      this.branches.add(new Branch(name));
      return true;
    }
    return false;
  }

  public boolean addNewCustomerToBranch(String branchName, String customerName, double initialTransaction) {
    Branch existingBranch = findBranch(branchName);
    if (existingBranch != null) {
      return existingBranch.newCustomer(customerName, initialTransaction);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
    Branch existingBranch = findBranch(branchName);
    if (existingBranch != null) {
      return existingBranch.addCustomerTransaction(customerName, amount);
    }
    return false;
  }

  //READ
  public boolean listCustomers(String branchName, boolean showTransactions) {
    Branch currentBranch = findBranch(branchName);
    if (currentBranch != null) {
      System.out.println("Customer details for branch " + currentBranch.getName());
      ArrayList<Customer> branchCustomers = currentBranch.getCustomers();

      for (int i=0; i<branchCustomers.size(); i++) {
        Customer branchCustomer = branchCustomers.get(i);
        System.out.println(i+1 + " . " + branchCustomer.getName());
          if(showTransactions) {
            System.out.println("Transactions");
            ArrayList<Double> transactions = branchCustomer.getTransactions();
            for(int j=0; j<transactions.size();j++) {
              System.out.println(transactions.get(j));
            }
          }
      }
      return true;
    } else {
      return false;
    }
  }

  private Branch findBranch(String branchName) {
    for (int i=0; i<this.branches.size();i++) {
      Branch branch = this.branches.get(i);
      if (branch.getName() == branchName) {
        return branch;
      }
    }
    return null;
  }
}
