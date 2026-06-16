public class InsertionSorting {
    public static void main(String[] args){
        int arr[]={4,1,2,3};
        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

