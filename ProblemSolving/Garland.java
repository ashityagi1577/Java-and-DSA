import java.util.*;
public class Garland{
    public static void main(String[] args){
        System.out.println("Enter");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int r=sc.nextInt();
        int g=sc.nextInt();
        int b=sc.nextInt();
        int total=r+g+b;
        int largest=Math.max(r, Math.max(g,b));
        int sum=total-largest;
        if(largest-1<=sum){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
}