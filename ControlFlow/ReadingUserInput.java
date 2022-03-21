package ControlFlow;
import java.util.Scanner;

public class ReadingUserInput {
  // public static void main(String[] args) {
  //   Scanner scanner = new Scanner(System.in);
  //   //scanner is java's built-in method that lets us read user's inputs
  //   System.out.println("Enter your year of birth: ");
  //   boolean hasNextInt = scanner.hasNextInt(); //check if input qualifies as an int or not

  //   if (hasNextInt) {
  //     int yearOfBirth = scanner.nextInt(); //RETRIEVE INT
  //     scanner.nextLine(); //handle the next line character (enter key)

  //     System.out.println("Enter your name: ");
  //     String name = scanner.nextLine(); //RETRIEVE STRING
  //     int age = 2022 - yearOfBirth;
  //     if (age >= 0 && age <= 100) {
  //       System.out.println("Your name is " + name + " and your age is " + age);
  //     } else {
  //       System.out.println("Invalid year of birth!");
  //     }
  //   } else {
  //     System.out.println("Unable to parse your year of birth! key numbers instead");
  //   }
  //   scanner.close();//close the scanner once we are done with it
  // }

  // public static void main(String[] args) {
  //   Scanner scanner = new Scanner(System.in);
  //   int sum = 0;
  //   int counter = 0;

  //   while(true) {
  //     int order = counter + 1;
  //     System.out.println("Enter number #" + order + " :");
  //     boolean isAnInt = scanner.hasNextInt();
  //     if (isAnInt) {
  //       int number = scanner.nextInt();
  //       counter++;
  //       sum += number;
  //       if (counter == 10) {
  //         break;
  //       }
  //     } else {
  //       System.out.println("Invalid number");
  //     }
  //     scanner.nextLine(); //handle end of line (enter key)
  //   }
  //   System.out.println("The total sum is: " + sum);
  //   scanner.close();
  // }

  public static void main(String[] args) {
  //   Scanner scanner = new Scanner(System.in);
  //   int max = 0;
  //   int min = 0;
  //   boolean first = true;
  //   //can use this instead of the boolean flag:
  //   //int min = integer.MIN_VALUE;

  //   while(true) {

  //     System.out.println("Enter number:");
  //     boolean isAnInt = scanner.hasNextInt();

  //     if (isAnInt) {
  //       int number = scanner.nextInt();
  //       //after user keys in first input - else min will always be 0
  //       if (first) {
  //         first = false;
  //         min = number;
  //         max = number;
  //       }
  //       if (number < min) {
  //         min = number;
  //       } else if (number > max) {
  //         max = number;
  //       }

  //     } else {
  //       break;
  //     }
  //     scanner.nextLine();
  //   }
  //   System.out.println("min is " + min + " max is " + max);
  //   scanner.close();
    System.out.println(getBucketCount(6.26,2.2));
  }

  public static void inputThenPrintSumAndAverage(){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    long roundAvg = 0;
    while(true){
      System.out.println("Enter number!!");
      boolean isAnInt = scanner.hasNextInt();
      if(isAnInt){
          count++;
          int number = scanner.nextInt();
          sum += number;
          roundAvg = Math.round((double) sum / (double) count);
      } else {
          break;
      }
    }
    System.out.println("SUM = " + sum + " AVG = " + roundAvg);
    scanner.close();
  }
  //MORE ON METHOD OVERLOADING + PRIMITIVE DATA TYPES
  public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
    if (width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0) {
      return -1;
    }
    double areaOfWall = width * height;
    double totalBucketsNeeded = areaOfWall / areaPerBucket;
    double bucketsNeeded = Math.ceil(totalBucketsNeeded - extraBuckets);
    return (int)bucketsNeeded;
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
      return -1;
    }
    double areaOfWall = width * height;
    double totalBucketsNeeded = Math.ceil(areaOfWall / areaPerBucket);
    return (int)totalBucketsNeeded;
  }

  public static int getBucketCount(double area, double areaPerBucket) {
    if (area <= 0 || areaPerBucket <= 0) {
      return -1;
    }
    double bucketsNeeded = Math.ceil(area / areaPerBucket);
    return (int)bucketsNeeded;
  }
}
