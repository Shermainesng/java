package Interfaces;

public interface ITelephone {

  //methods that a class that specifies the interface MUST implement
  //abstract - no code, just specify the names
  //provide a common behavior for the way a class is used - a contract
  //classes can inherit from more than 1 interface

  //signatures - methods that this class has to implement
  public void powerOn();
  public void dial(int phoneNumber);
  public void answer();
  public boolean callPhone(int phoneNumber);
  public boolean isRinging();

}
