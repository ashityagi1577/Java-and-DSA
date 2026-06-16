import java.util.*;
public class Multiplication {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a,b,c,multiplication;
       System.out.println("Enter first numbers: ");
         a=sc.nextInt();
         System.out.println("Enter second numbers: ");
         b=sc.nextInt();    
            System.out.println("Enter third numbers: ");    
            c=sc.nextInt();
            multiplication=a*b*c;
            System.out.println("Multiplication of three numbers is: "+multiplication);
            sc.close();

    }
}


