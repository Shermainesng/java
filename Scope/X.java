package Scope;

public class X {
  private int x;

  public X(int x) {
    this.x = x;
  }

  public void timeTable() {
    for (int i=0; i<=12; i++) {
      System.out.println(i + " times " + this.x + " equals " + i*this.x);
    }
  }
}
