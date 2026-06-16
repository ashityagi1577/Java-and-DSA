public class ArraySorted {
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        boolean issorted=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=true;
                break;
            }
        }

        if(issorted){
            System.out.println("Array is not sorted");
        } else {
            System.out.println("Array is sorted");
        }
    }
}


