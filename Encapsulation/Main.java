package Encapsulation;

public class Main {
  public static void main(String[] args) {
    Printer printer = new Printer(50, true);
    System.out.println("initial page count " + printer.getPagesPrinted());
    printer.printPages(50);
    System.out.println("pages printed was " + printer.getPagesPrinted());
    printer.printPages(20);
    System.out.println("pages printed was " + printer.getPagesPrinted());

  }
}
