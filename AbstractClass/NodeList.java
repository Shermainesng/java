package AbstractClass;

//an interface that any structure using node objects will implement
public interface NodeList {
  ListItem getRoot();
  boolean addItem(ListItem item);
  boolean removeItem(ListItem item);
  void traverse(ListItem root);
}
