public class Average {
     public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum=0;

        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        int avg=sum/5;
        System.out.println(avg);
    }
}
