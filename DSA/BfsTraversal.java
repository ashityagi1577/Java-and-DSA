import java.util.*;

public class BfsTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7;
        int m = 6;
        @SuppressWarnings("unchecked")

      ArrayList<Integer>[] arr = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr[u].add(v);
            arr[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n + 1];

        int source = sc.nextInt();

        vis[source] = true;
        q.add(source);

        while (!q.isEmpty()) {
            int z = q.poll();

            System.out.print(z + " ");

            for (int adj : arr[z]) {
                if (!vis[adj]) {
                    vis[adj] = true;
                    q.add(adj);
                }
            }
        }

        System.out.println();
        sc.close();
    }
}