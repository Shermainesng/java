package OOP;

public class SimpleCalculator {
  //INSTANCE VARIABLES
  private double firstNumber;
  private double secondNumber;

  //INSTANCE METHODS
  //getters
  public double getFirstNumber() {
    return firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  //setters
  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  public double getAdditionResult() {
    return firstNumber + secondNumber;
  }

  public double getSubtractionResult() {
    return firstNumber - secondNumber;
  }

  public double getMultiplicationResult() {
    return firstNumber * secondNumber;
  }

  public double getDivisionResult() {
    if (secondNumber == 0) {
      return 0;
    }
    return firstNumber / secondNumber;
  }
}
