import java.util.*;
public class VanyaAndFence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] arr=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>h){
                a=a+2;
            }
            else{
                a++;
            }
    }
    System.out.println(a);
    sc.close();
    }
    
}
