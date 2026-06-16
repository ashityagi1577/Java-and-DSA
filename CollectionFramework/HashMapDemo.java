import java.util.*;
public class HashMapDemo {
    public static void main(String[] args){
        Map<Integer,String>students=new HashMap<>();
        students.put(35,"Ashi");
        students.put(17,"Akshara");
        students.put(7,"Chhaya");
        students.put(4,"Priya");
        students.put(3,"Bittu");
        
        System.out.println(students);
        students.put(35,"Manu");
         System.out.println(students);
         System.out.println("the value of 3th key is:" +students.get(3));

         //Interacting a map
          
         for(Map.Entry<Integer,String>map : students.entrySet()){
            System.out.println("the key is" +map.getKey()+ "and the value is " +map.getValue());
         
         }

         

    }
}

