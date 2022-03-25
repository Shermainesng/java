package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class BankOperator {

  public static void main(String[] args) {

    Bank bank = new Bank("BOFA");
    //add new branch
    bank.addNewBranch("NYC");
    bank.addNewBranch("LA");

    //add customers to that branch
    bank.addNewCustomerToBranch("NYC", "sher", 100.00);
    bank.addNewCustomerToBranch("NYC", "mike", 100.00);
    bank.addNewCustomerToBranch("LA", "henry", 100.00);

    //adding transactions to customers' banks
    bank.addCustomerTransaction("NYC", "sher", 50.00);
    bank.addCustomerTransaction("LA", "henry", 50.00);

    //list customers for each branch
    bank.listCustomers("NYC", true);
    bank.listCustomers("LA", true);

  }

}
