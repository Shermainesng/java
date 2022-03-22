package OOP;

public class Wall {
  private double width;
  private double height;

  //constructor 1
  public Wall() {
  }
  //constructor 2
  public Wall(double width, double height) {
    setWidth(width);
    setHeight(height);
  }
  //getters
  public double getWidth() {
    return this.width;
  }
  public double getHeight() {
    return this.height;
  }
  //setters
  public void setWidth(double width) {
    if (width < 0) {
      this.width = 0;
    } else {
      this.width = width;
    }
  }
  public void setHeight(double height) {
    if (height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }
  public double getArea() {
    return this.height * this.width;
  }
}
