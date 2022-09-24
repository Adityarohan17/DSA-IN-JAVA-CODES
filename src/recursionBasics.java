public class recursionBasics {
    public static int firstOccurence(int arr[], int key, int i){
       if(i==arr.length){
        return -1;
       }
       
        if(arr[i] ==  key){
            return i ;

        }
        return firstOccurence(arr, key, i+1);
    }
    
public static void main(String args[]){
    int arr [] ={8,2,3,9,5,4,1};
    // firstOccurence(arr, 4, 0);
    System.out.println( firstOccurence(arr, 4, 0));

}

}
