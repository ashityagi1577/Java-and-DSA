import java.util.*;
public class Watermelon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int w=sc.nextInt();

        if(w<=2){
            System.out.println("No");
        }
        else if(w%2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}

