public class SelectionSorting {
 public static void main(String[] args){
    int[] arr = {5, 4, 3, 2, 1};
    int n = arr.length;
    for(int i=0; i<n-1; i++){
        int minimum_index = i;
        int value = arr[i];
        for(int j = i+1; j<n; j++){
            if(value > arr[j]){
                minimum_index = j;
                value = arr[j];
            }
        }
        int temp = arr[i];
        arr[i] = arr[minimum_index];
        arr[minimum_index] = temp;
    }
    for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
 }    
}
