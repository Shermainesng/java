package Scope;

public class Main {

  public static void main(String[] args) {
    String privateVar = "this is private to main()";

    ScopeCheck scopeInstance = new ScopeCheck();
    System.out.println("scopeInstance private var is " + scopeInstance.getPrivateVar());
    System.out.println(privateVar);

    scopeInstance.timesTwo();
    scopeInstance.useInner();

    //InnerClass in ScopeCheck
    System.out.println("******************");
    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
    innerClass.timesTwo();

  }

}
