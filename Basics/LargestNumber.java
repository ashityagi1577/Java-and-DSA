import java.util.*;
public class LargestNumber {
    public static void main(String[] args){
        System.out.println("Enter three numbers:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    if(a>b && a>c){
        System.out.println("a is largest number");
    }
    else if(b>a && b>c){
        System.out.println("b is largest number");
    }
    else{
        System.out.println("c is largest number");
    }
    sc.close();
}
}
