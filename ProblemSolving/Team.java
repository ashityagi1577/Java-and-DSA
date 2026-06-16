import java.util.*;
 class Team {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int count=0;
       int n=sc.nextInt();

       /*while(n>0)
       {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a+b+c)>=2){
               count++;
            }
            n--;
        }
    System.out.println(count);
       */
      for(int i=0;i<n;i++){
        int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a+b+c)>=2){
               count++;
      }
    }
    System.out.println(count);
    sc.close();
}
 }
    

