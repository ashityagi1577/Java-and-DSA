
import java.util.Arrays;

public class DP {
    static int[] arr = new int[31];

    static int f(int n) {
        if (n <= 1) {
            return n;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = f(n - 1) + f(n - 2);
        return arr[n];
    }

    public static void main(String[] args) {
        Arrays.fill(arr, -1);
        System.out.println(f(30));
    }
}

