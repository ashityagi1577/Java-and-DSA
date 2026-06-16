import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class BFSGraphTraversal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=7, m=6;
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] arr = new ArrayList[n+1];
        for(int i =0; i<=n; i++){
                arr[i] = new ArrayList<>();
        }
        
        for(int i=0; i<m; i++){
            int u,v;
            u = sc.nextInt();
            v = sc.nextInt();
            arr[u].add(v);
            arr[v].add(u);
        }
    
        for(int i=1; i<=n; i++){
            for(int z: arr[i]){
                System.out.println(z);
            }
            System.out.println();
        }
    
        Queue<Integer>q = new LinkedList<>();
         boolean vis[] = new boolean[n+1];
         int source = sc.nextInt();
         vis[source] = true;
         q.add(source);
    
       while(!q.isEmpty()){
        int sz = q.size();

        for(int i=0; i<sz; i++){
            int z = q.poll();
            System.out.println(z);
            for(int adj : arr[z]){
            if(!vis[adj]){
                vis[adj] = true;
                q.add(adj);
            }
            
        }  
    }     
        System.out.println();
    }
    sc.close();
}
}
