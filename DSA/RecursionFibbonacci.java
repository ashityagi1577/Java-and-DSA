public class RecursionFibbonacci{
    static int f(int n){
        if(n<=1){
            return n;
        }
        else{
        return f(n-1)+ f(n-2);
        }
    }
    public static void main(String[] args){
        System.out.println(f(7));
    }
}
