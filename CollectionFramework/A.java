//1. containsAll()- check if list1 is the superset of list2
//2. retainAll()
//3. removeAll()

import java.util.ArrayList;
import java.util.List;

class ArrayListOperations{
    public static void main(String[] args){
  List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
  list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
  list2.add(1); list2.add(2); list2.add(3); list2.add(4); list2.add(7);

  System.out.println("Does the list1 contains all elements of list2?" +list1.containsAll(list2));
System.out.println("The intersection of list 1 and list 2 is " + list1.retainAll(list2) );    
}
}
