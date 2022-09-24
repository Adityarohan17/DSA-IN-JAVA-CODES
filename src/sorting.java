
import java.util.Arrays;
public class sorting {



    // public static void bubbleSort(int arr[]){
    //     for(int i =0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;                     
    //             }
    //         }
    //     }
    // }


    // SELECTION SORT //

    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;i<arr.length;j++){
                if(arr[minPos] < arr[j]){
                    minPos =j;
                }
            }
            // swap //
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]=temp;

        }
    }

public static void printARR(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    
}
    
    public static void main (String args[]){
        int arr[] = {5,4,3,1,2};
    // selectionSort(arr);
Arrays.sort(arr, 0 , 3 );
    printARR(arr);

    }

    private static void extracted(int[] arr) {
        selectionSort (arr);
    }
   
    
}

// the 