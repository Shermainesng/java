package ControlFlow;

public class WhileAndDoStatement {
  //DO WHILE - do block is executed at least once and then the condition is checked
  public static void main(String[] args) {
    int count = 1;
    do {
      System.out.println("Count value was " + count);
      count++;
    } while(count !=6);

    //TESTS for isEvenNumber - WHILE and CONTINUE
    int number = 4;
    int finishNumber = 20;
    int countOfEvenNumbers = 0;
    while (number <= finishNumber) {
      number++;
      if(!isEvenNumber(number)) {
        continue; //if number is odd, it'll end the current iteration (bypass the print statement)
      }
      countOfEvenNumbers++;
      if(countOfEvenNumbers >= 5) {
        break;
      }
      System.out.println("Even number " + number);
    }
    System.out.println("We found " + countOfEvenNumbers + " even numbers");

    //TEST for sumDigits
    System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
    //TEST for palindrome number
    System.out.println(isPalindrome(-1221));
    //TEST for sumFirstAndLast
    System.out.println(sumFirstAndLastDigit(193));
    //TEST for evenDigitSum
    System.out.println(getEvenDigitSum(252));
    //TEST for hasSharedDigit
    System.out.println(hasSharedDigit(46, 25));
    //TEST for hasSameLastDigit
    System.out.println(hasSameLastDigit(41, 22, 71));
    //TEST for getGreatestCommonDivisor
    System.out.println(getGreatestCommonDivisor(81, 153));
    //TEST for printFactors
    printFactors(32);
    //TEST for isPerfectNumber
    System.out.println(isPerfectNumber(5));
    //TEST for number to words
    numberToWords(32);
  }

 //CHALLENGE - ISEVENNUMBER
  public static boolean isEvenNumber(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  //CHALLENGE - DIGIT SUM
  private static int sumDigits(int number) {
    if(number < 10) {
      return -1;
    }
    int sum = 0;
    while (number > 0) {
      int leastSignificantDigit = number % 10; //remainder of 125/10 is 5
      sum += leastSignificantDigit;
      number /= 10; //125/10 = 12, send it back to loop to get 2, and then get 1
    }
    return sum;
  }

  //CHALLENGE - NUMBER PALINDROME (negative numbers can be palindrome numbers)
  private static boolean isPalindrome(int number) { //707
    int reverse = 0;
    int palindrome = number;
    if (number == 0) {
      return false;
    }

    do {
      int lastDigit = number % 10;
      reverse = (reverse * 10) + lastDigit;
      number /= 10;
    } while (number != 0);

    if (palindrome ==  reverse) {
      return true;
    } else {
      return false;
    }
  }

  //CHALLENGE - FIRST AND LAST DIGIT SUM
  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    }

    int lastDigit = number % 10;
    int firstDigit = 0;
    while (number > 0) {
      firstDigit = number % 10;
      number /= 10;
    }
    return firstDigit + lastDigit;
  }

  //CHALLENGE - EVEN DIGIT SUM
  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }
    int sum = 0;
    while (number > 0) {
      int lastDigit = number % 10;
      number /= 10;
      if (lastDigit % 2 == 0) {
        sum += lastDigit;
      }
    }
    return sum;
  }

  //CHALLENGE - HAS SHARED DIGIT
  public static boolean hasSharedDigit(int numOne, int numTwo) {
    if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
      return false;
    }
    while (numOne > 0 || numTwo > 0) {
      int numOneLastDigit = numOne % 10;
      int numTwoLastDigit = numTwo % 10;
      numOne /= 10;
      numTwo /= 10;
      if (numOneLastDigit == numTwoLastDigit || numOneLastDigit == numTwo || numTwoLastDigit == numOneLastDigit || numOne == numTwo) {
        return true;
      } else {
        return false;
      }
    } return false;
  }

  //CHALLENGE - HASSAMELASTDIGIT
  public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
    if (numOne < 10 || numOne > 1000 || numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000) {
      return false;
    }
    int numOneLastDigit = numOne % 10;
    int numTwoLastDigit = numTwo % 10;
    int numThreeLastDigit = numThree % 10;
    if (numOneLastDigit == numTwoLastDigit || numOneLastDigit == numThreeLastDigit || numTwoLastDigit == numThreeLastDigit) {
      return true;
    }
    return false;
  }

  //CHALLENGE - GREATEST COMMON DIVISOR
  public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) {
      return -1;
    }
    int highestDivisor = 0;
    for (int i=1; i<= first; i++) {
      int remainder = first % i;
      if (remainder == 0) {
        if (second % i == 0) {
          highestDivisor = i;
        }
      }
    }
    return highestDivisor;
  }

  public static void printFactors(int number) {
    if (number < 1) {
      System.out.println("Invalid Value");
      return;
    }
    for (int i=1; i<=number; i++) {
      if (number % i == 0) {
        System.out.println(i + " ");
      }
    }
  }

  public static boolean isPerfectNumber(int number) {
    if (number < 1) {
      return false;
    }
    int sumOfFactors = 0;
    for (int i=1; i<number; i++) {
      if (number % i == 0) {
        sumOfFactors += i;
      }
    }
    if (number == sumOfFactors) {
    return true;
    } else {
      return false;
    }
  }

  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
      return;
    }
    while (number != 0) {
      int lastDigit = number % 10;
      switch(lastDigit) {
        case 0:
        System.out.println("Zero");
        break;
        case 1:
        System.out.println("One");
        break;
        case 2:
        System.out.println("Two");
        break;
        case 3:
        System.out.println("Three");
        break;
        case 4:
        System.out.println("Four");
        break;
        case 5:
        System.out.println("Five");
        break;
        case 6:
        System.out.println("Six");
        break;
        case 7:
        System.out.println("Seven");
        break;
        case 8:
        System.out.println("Eight");
        break;
        case 9:
        System.out.println("Nine");
        break;
      }
      number /= 10;
    }
  }
}
