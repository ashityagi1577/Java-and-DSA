import java.util.*;
public class Set {
public static void main(String[] args){
    HashSet<String>car1=new HashSet<>();
    TreeSet<String>car2=new TreeSet<>();

    //adding values int the hashset+add
    car1.add("maruti");
    car1.add("Kia");
    car1.add("Toyota");
    car1.add("Maruti");
    car1.add("Kia");

    car2.add("maruti");
    car2.add("Kia");
    car2.add("Toyota");
    car2.add("Maruti");
    car2.add("Kia");
    
    System.out.println(car1);
    System.out.println(car2);

    //check if a value is present or not
    if(car1.contains("Maruti")){
        System.out.println("Maruti is present");
    }
    if(car1.contains("Volvo")){
        System.out.println("Volvo is present");
    }
    else{
        System.out.println("Volvo is not present");
    }

    for(String s:car1){
        System.out.println(s);
    }
}    
}

