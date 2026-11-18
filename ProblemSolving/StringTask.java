import java.util.*;
public class StringTask {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();

       for(int i=0;i<s.length();i++){   
        char c=s.charAt(i);
        if(c!='a' && c!='o' && c!='y' && c!='e' && c!='u' && c!='i'){
        sb.append('.');
        sb.append(c);
        
        }
        }
        System.out.println(sb);
       sc.close();
       
    }
}
