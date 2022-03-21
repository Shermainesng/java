package OOP;

public class Car { //public - unrestricted access to this class
  //these variables are the state component for a car
  //private means that only the car class can access these variables
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;

  //SETTER - method that can update car object's model
  public void setModel(String model) {
    String validModel = model.toLowerCase();
    //some validations - only allow models to be set as porsche or holden
    if(validModel.equals("carrera") || validModel.equals("commodore")) {
      this.model = model;
    } else {
      this.model = "Unknown";
    }
  }

  //GETTER - let us access the model from outside of this class
  public String getModel() {
    return this.model;
  }
}
