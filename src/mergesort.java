public class mergesort {

    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[] , int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = (si+ei)/2;
        mergeSort(arr, 0, mid); // left part 
        mergeSort(arr, mid+1, ei);  // right part //

        merge(arr, si, ei, mid);
    }
    public static void merge(int arr[], int si, int ei, int mid){

        int temp[] = new int[ei-si+1];
        int i = si; // 1st index of the array
        int j = mid+1; // 2nd index of the array
        int k =0;

        while(i<=mid && j<=ei){


        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
            

        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
        }
        while(i<=mid){
            temp[k++] =arr[i++];


           }
           while(j<=ei){
            temp[k++] = arr[j++];
           }
            
           for(i=si;i<=ei;i++){
            temp[k] = arr[i];
           }

    }

}



    public static void main(String args[]){
        int arr[] = {3,9,7,5,1};
        mergeSort(arr, 0, arr.length-1);
        // System.out.println(printArr(arr));
        printArr(arr);

    }

    



