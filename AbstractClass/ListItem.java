package AbstractClass;

public abstract class ListItem {
  //creating instances of this class within the class
  //protected access modifier - variables can only be accessed by the subclasses within this package
  protected ListItem rightLink = null;
  protected ListItem leftLink = null;

  protected Object value;

  public ListItem(Object value) {
    this.value = value;
  }
  //methods that can be overridden
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  //all classes extending from this class must implement these:
  abstract ListItem next();
  abstract ListItem setNext(ListItem item);
  abstract ListItem previous();
  abstract ListItem setPrevious(ListItem item);
  abstract int compareTo(ListItem item);

}
