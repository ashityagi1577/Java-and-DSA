import java.util.*;
public class A_prefixSuffix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String t=sc.nextLine();

        boolean prefix=true;
        boolean suffix=true;

        for(int i=0;i<n;i++){
            if(t.charAt(i)!=s.charAt(i)){
                prefix=false;
                break;
            }
 

        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=t.charAt(m-n+i)){
                suffix=false;
                break;
            }
        }

        if(prefix && suffix){
            System.out.println(0);
        }
        else if(prefix){
            System.out.println(1);
        }
        else if(suffix){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
        sc.close();
    }
}

