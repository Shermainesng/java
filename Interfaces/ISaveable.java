package Interfaces;

import java.util.List;

public interface ISaveable {

  //use List instead of specifying ArrayList/LinkedList to allow for some flexibility
  List<String> write();
  void read (List<String> savedValues);
}
