package FinalStaticStatements;


public class Main {

  public static void main(String[] args) {
    SomeClass one = new SomeClass("one");
    SomeClass two = new SomeClass("two");
    SomeClass three = new SomeClass("three");

    System.out.println(one.getInstanceNumber());
    System.out.println(two.getInstanceNumber());

    // one.instanceNumber = 4; will now work as instanceNumber is final variable
    // Math.PI is also a final variable

    int pw = 5435;
    Password password = new Password(pw);
    password.storePassword();

  }



}
