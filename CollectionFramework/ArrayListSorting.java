import java.util.*;
public class ArrayListSorting{
public static void main(String[] args){
List<Integer>Numbers=new ArrayList<>();
Numbers.add(10);
Numbers.add(20);
Numbers.add(30);
Numbers.add(40);
Numbers.add(50);
Numbers.add(60);
System.out.println(Numbers);


Numbers.sort(null);
Collections.sort(Numbers);

for(int i=0;i<Numbers.size();i++){
    System.out.println("the value at index i:"+Numbers.get(i));
}

for(Integer num:Numbers){
    System.out.println(num+" ");
}

}    
}

