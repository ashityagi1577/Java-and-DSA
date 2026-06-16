import java.util.*;
public class RangeSum {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    for(int i=1; i<q; i++){
          int l = sc.nextInt();
          int r = sc.nextInt();
          int sum = 0;
          for(int j=l-1; j<r; j++){
            sum += arr[j];
          }
          System.out.println(sum);
    }
      sc.close();
 }    
}

