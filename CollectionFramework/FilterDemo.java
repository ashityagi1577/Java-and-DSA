import java.util.List;
public class FilterDemo{
public static void main(String[] args){
    //Source Data
    List<Integer>numbers=List.of(1,2,3,4,5,6);
    System.out.println("keeping only the even numbers ");
    //Conveyor belt start
    numbers.stream()
    //Intermediate operation
       .filter(n -> n % 2 == 0)
    //Terminal Operation
    .forEach(System.out::println);
}    
}
