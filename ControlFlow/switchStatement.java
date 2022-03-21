package ControlFlow;

public class switchStatement {
  public static void main(String[] args) {
    int switchValue = 4;

    switch(switchValue) {
      case 1:
        System.out.println("value was 1");
        break;
      case 2:
        System.out.println("value was 2");
        break;
      case 3: case 4: case 5:
        System.out.println("was a 3, or a 4, or a 5");
        System.out.println("to be precise it was a " + switchValue);
        break;

      default:
        System.out.println("was not 1 or 2");
        break;
    }

    char switchStatement = 'A'; //DEFINE A CHAR USING SINGLE QUOTES, STRING IS DOUBLE QUOTES
    switch(switchStatement) {
      case 'A':
        System.out.println("Value was A");
        break;
      case 'B':
        System.out.println("Value was B");
        break;
      case 'C': case 'D': case 'E':
        System.out.println("value was C, D or E");
        break;
      default:
        System.out.println("Value was not found");
        break;
    }

    String month = "May";
    switch(month.toLowerCase()) {
      case "January":
        System.out.println("Jan");
        break;
      case "June":
        System.out.println("Jun");
        break;
      default:
        System.out.println("not sure");
        break;
    }

    System.out.println(getDaysInMonth(1, 2020));
    System.out.println(getDaysInMonth(2, 2020));
  }

  public static void printDayOfTheWeek(int day) {
    switch(day) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Mon");
        break;
      case 2:
        System.out.println("Tue");
        break;
      case 6:
        System.out.println("Sat");
        break;
      default:
        System.out.println("invalid day");
        break;
    }
  }

  public static void printNumberInWord(int number) {
    switch(number) {
      case 0:
        System.out.println("ZERO");
        break;
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default:
        System.out.println("other");
        break;
    }
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    }
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12 || year < 1 || year > 9999) {
      return -1;
    }
    switch(month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        return 31;
      case 2:
        if (isLeapYear(year)) {
          return 29;
        } else {
          return 28;
        }
      case 4: case 6: case 9: case 11:
        return 30;
      default:
        return -1;
    }
  }
}
