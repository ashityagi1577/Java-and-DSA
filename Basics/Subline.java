import java.util.*;
public class Subline {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
   
    while(t-->0){
      int x=sc.nextInt();
     int  n=sc.nextInt();
     int sum=0;
         for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum-x;
            }
            else{
                sum=sum+x;
            }
        }
        System.out.println(sum);
    
    }
    sc.close();
    
}    
}

