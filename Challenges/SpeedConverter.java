
package Challenges;
public class SpeedConverter {
  public static void main(String[] args) {
    long miles = toMilesPerHour(10.5);
    System.out.println("Miles = " + miles);

    printConversion(10.5);
    printMegaBytesAndKiloBytes(2500);
    System.out.println(shouldWakeUp(true, 1));

    System.out.println(isLeapYear(-1600));
    System.out.println(isLeapYear(1600));
    System.out.println(isLeapYear(1924));
    //if printing from another file, use SpeedConverted.printConvertion(10.5)
  }

    // challenge
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milesToKilo = Math.round(kilometersPerHour / 1.609);
            return milesToKilo;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesToKilo = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesToKilo + " mi/h");
        }
    }

    //CHALLENGE2
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
      if (kiloBytes < 0) {
          System.out.println("Invalid Value");
      } else {
          int megaBytes = kiloBytes / 1024;
          int leftoverKB = kiloBytes % 1024;
          System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + leftoverKB + " KB");
      }
    }

    //CHALLENGE 3
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
      if (barking && hourOfDay >= 0 && hourOfDay <= 23) {
        if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
          return false;
        }
    } else {
      return false;
    }
  }
    //CHALLENGE 4
    public static boolean isLeapYear(int year) {
      if (year >= 1 && year <= 9999) {
        if (year % 4 == 0) {
          if (year % 100 == 0) {
            if (year % 400 == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
            return false;
        }
      } else {
        return false;
      }
    }

    //CHALLENGE 5
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
      numberOne = (int)(numberOne * 1000);
      numberTwo = (int)(numberTwo * 1000);
      if (numberOne == numberTwo) {
          return true;
      } else {
          return false;
      }
    }
}


//psvm - public static void main
//sout - system.out.println
