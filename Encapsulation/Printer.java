package Encapsulation;

public class Printer {
  private int tonerLevel;
  private int pagesPrinted;
  private boolean isDuplex;

  public Printer(int tonerLevel, boolean isDuplex) {
    if (tonerLevel >= 1 && tonerLevel <= 100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }
    this.pagesPrinted = 0;
    this.isDuplex = isDuplex;
  }

  public int addToner(int tonerAmt) {
    if (tonerLevel > 0 && tonerAmt <= 100) {
      if (this.tonerLevel + tonerAmt > 100) {
        return -1;
      }
      this.tonerLevel += tonerAmt;
      return this.tonerLevel;
    } else {
      return -1;
    }
  }
  public int printPages(int pages) {
    int pagesToPrint = pages;
    if(this.isDuplex) { //print double sided
      pagesToPrint = (pages/2) + (pages % 2);
      System.out.println("Printing in duplex mode");
    }
    this.pagesPrinted += pagesToPrint;
    return pagesToPrint;
  }

  //GETTER
  public int getPagesPrinted() {
    return pagesPrinted;
  }
}
