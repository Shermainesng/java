package Innerclasses;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static Button btnPrint = new Button("Print");
  public static void main(String[] args) {
  //NESTED INTERFACE
    class ClickListener implements Button.OnClickListener {
      public ClickListener() {
        System.out.println("I've been attached");
      }

      @Override
      public void onClick(String title) {
        System.out.println(title + " was clicked");
      }
    }

    btnPrint.setOnClickListener(new ClickListener());
    listen();
  }

  private static void listen() {
    boolean quit = false;
    while (!quit) {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
        case 0:
          quit = true;
          break;
        case 1:
          btnPrint.onClick();
          break;
      }
    }
  }
    // Gearbox gearBoxOne = new Gearbox(6);
    // // //referencing outer class!
    // // Gearbox.Gear firstGear = gearBoxOne.new Gear(1, 12.3); //creating a new Gear instance in the Gearbox class
    // // System.out.println(firstGear.driveSpeed(1000));

    // gearBoxOne.addGear(1,5.3);
    // gearBoxOne.addGear(2, 10.6);
    // gearBoxOne.addGear(3, 15.9);
    // gearBoxOne.operateClutch(true);
    // gearBoxOne.changeGear(1);
    // gearBoxOne.operateClutch(false);
    // System.out.println(gearBoxOne.wheelSpeed(1000));
    // gearBoxOne.changeGear(2);
    // System.out.println(gearBoxOne.wheelSpeed(3000));
}
