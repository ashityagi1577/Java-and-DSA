import java.util.*;
public class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<Integer>list=new LinkedList<>();
        
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.set(3,6);
        System.out.println(list);

    }
}
