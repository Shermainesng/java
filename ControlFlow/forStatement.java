package ControlFlow;

public class forStatement {

  public static void main(String[] args) {
    System.out.println("increasing for loop");
    for(int i=2; i<9; i++) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
    }
    System.out.println("decreasing for loop");
    for(int i=8; i>=2; i--) {
      System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
    }

    System.out.println("are these prime numbers");
    int counter = 0;
    for (int i=10; i<50; i++) {
      if (isPrime(i)) {
        counter += 1;
        if (counter == 3) {
          break;
        } else {
          System.out.println(i + " is a prime number, now there are " + counter + "prime numbers");
        }
      }
    }

    System.out.println("sum 3 and 5 challenge");
    int secondCounter = 0;
    int totalSum = 0;
    for (int i=1; i <=1000; i++) {
      if (i % 5 == 0 && i % 3 == 0) {
        System.out.println(i);
        secondCounter ++;
        totalSum += i;
        if (secondCounter == 5) {
          break;
        }
      }
    }
    System.out.println(totalSum);

    //challenge 14 test
    System.out.println(sumOdd(1, 100));
  }

  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate/100));
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i=2; i <= (long) Math.sqrt(n); i++) {
      if (n % i == 0) { //can be divided by sth else, so can't be a prime no
        return false;
      }
    }
    return true;
  }

  //CHALLENGE 14 - SUM OFF
  public static boolean isOdd(int number) {
    if (number <= 0) {
      return false;
    }
    if (number % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  public static int sumOdd(int start, int end) {
    int sumOfOdd = 0;
    if (end >= start && start > 0 && end > 0) {
      for (int i=start; i<=end; i++) {
        if (isOdd(i)) {
          sumOfOdd += i;
        }
      }
    } else {
      return -1;
    }
    return sumOfOdd;
  }
}
