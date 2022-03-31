package Scope;

public class ScopeCheck {
  public int publicVar = 0;
  private int privateVar = 1;

  public ScopeCheck() {
    System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
  }

  public int getPrivateVar() {
    return privateVar;
  }

  public void useInner() {
    InnerClass innerClass = new InnerClass();
    System.out.println("privateVar from inner class: " + innerClass.privateVar);
  }

  public void timesTwo() {
    int privateVar = 2;
    for (int i=0; i<10; i++) {
      System.out.println(i + " times two is " + i* privateVar); //the privateVar defined in this method is used
      // System.out.println(i + " times two is " + i* this.privateVar); //the original privateVar defined in the class (1) is used
    }
  }

  public class InnerClass {
    public int privateVar = 3;

    public InnerClass() {
      System.out.println("InnerClass created, privateVar is " + privateVar);
    }

    public void timesTwo() {
      for (int i=0; i<10; i++) {
        System.out.println(i + " times two is " + i* ScopeCheck.this.privateVar); //refers to '1'
        // System.out.println(i + " times two is " + i* this.privateVar); //refers to '3'
      }
    }
  }
}
