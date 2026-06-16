import java.util.*;

@FunctionalInterface
interface Calculator1{
    int operate(int a,int b);

}
public class FuncInterface {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    Calculator1 addition = (a,b)-> (a+b);
    System.out.println("the addition  :" +addition.operate(x,y));

    Calculator1 multiplication=(a,b)-> (a*b);
    System.out.println("the multiplication :"+ multiplication.operate(x,y));

    Calculator1 subtraction=(a,b)-> (a-b);
    System.out.println("The subtraction  :" +subtraction.operate(x,y));

    Calculator1 division=(a,b)-> {
        try{
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
            return 0;
        }

    };
      System.out.println("The division  :" +division.operate(x,y));
 
 sc.close();
   }   
}


