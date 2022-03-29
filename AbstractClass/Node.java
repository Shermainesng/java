package AbstractClass;

import java.util.List;

public class Node extends ListItem{
  public Node(Object value) {
    super(value);
  }

  @Override
  public ListItem next() {
    return this.rightLink;
  }

  @Override
  public ListItem setNext(ListItem item) {
    this.rightLink = item;
    return this.rightLink;
  }

  @Override
  public ListItem previous() {
    return this.leftLink;
  }

  @Override
  public ListItem setPrevious(ListItem item) {
    this.leftLink = item;
    return this.leftLink;
  }

  //compareTo method compares 2 strings, and
     //returns 0 if they are equal
     //returns <0 is string is less than the other
     //returns >0 is string is more than the other string
  @Override
  public int compareTo(ListItem item) {
    if (item != null) {
      //get the current value and implement the compareTo method inherited from String class
      return ((String) super.getValue()).compareTo((String) item.getValue());
    } else {
      return -1;
    }
  }
}
