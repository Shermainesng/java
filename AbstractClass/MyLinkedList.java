package AbstractClass;

public class MyLinkedList implements NodeList{
  private ListItem root = null;

  public MyLinkedList(ListItem root) {
    this.root = root;
  }

  @Override
  public ListItem getRoot() {
    return root;
  }

  @Override
  public boolean addItem(ListItem newItem) {
    if (this.root == null) {
      //list is empty, so this item becomes the head
      this.root = newItem;
      return true;
    }
    //start from the root, then traverse through until we find the end, then add newItem as the next node
    ListItem currentItem = this.root;
    while(currentItem != null) {
      int comparison = (currentItem.compareTo(newItem));
      if (comparison < 0) {
        //newItem is greater than current node, move right
        if (currentItem.next() != null) {
          currentItem = currentItem.next();
        } else {
          //no next, we have reached end of list. set newItem as next
          // currentItem.setNext(newItem);
          // newItem.setPrevious(currentItem);
          currentItem.setNext(newItem).setPrevious(currentItem);
          return true;
        }

      } else if (comparison > 0) {
        //newItem is lesser than current node, insert on the left (shift current node to the right)
        if (currentItem.previous() != null) {
          currentItem.previous().setNext(newItem);
          newItem.setPrevious(currentItem.previous());
          newItem.setNext(currentItem);
          currentItem.setPrevious(newItem);
        } else {
          //no previous, we are at the head/root of the list. set newItem as new head
          newItem.setNext(this.root);
          this.root.setPrevious(newItem);
          this.root = newItem;
        }
        return true;

      } else {
        //equal
        System.out.println(newItem.getValue() + " is already present in the list");
        return false;
      }
    }
    return false;
  }

  @Override
  public void traverse(ListItem root) {
    if (root == null) {
      System.out.println("The list is empty");
    } else {
      while (root != null) {
        System.out.println(root.getValue());
        root = root.next();
      }
    }
  }

  @Override
  public boolean removeItem(ListItem item) {
    if(item != null) {
      System.out.println("Deleting item " + item.getValue());
    }

    ListItem currentItem = this.root;
    while(currentItem != null) {
      int comparison = currentItem.compareTo(item);
      if (comparison == 0) { //found the item
        //if item to delete is the root
        if(currentItem == this.root) {
          this.root = currentItem.next();
        } else {
          currentItem.previous().setNext(currentItem.next());
          if (currentItem.next() != null) {
            currentItem.next().setPrevious(currentItem.previous());
          }
        }
        return true;
      } else if(comparison < 0) {
        //haven't reached end of list yet
        currentItem = currentItem.next();
      } else {
        //we are at an item greater than the one to be deleted, so the item is not in the list
        return false;
      }
    }
    return false;
  }

}
