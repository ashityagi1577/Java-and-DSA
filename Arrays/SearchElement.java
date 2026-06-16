public class SearchElement {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int search=3;
        boolean found = false;

        for(int i=0;i<5;i++){
            if(arr[i]==search){
                
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
