
public class transpose {
    public static  void main(String args[]){
        //   Original array //
            int arr[][] = {{1,3,4},{2,4,3},{3,4,5}}; 
    
            // transpose array //
            int transpose [][] = new int[3][3];
    
            for(int i=0;i<3;i++){
                for(int j =0;j<3;j++){
                    transpose[i][j] = transpose[j][i];
                }
            }
            System.out.println("print matrix without transpose");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    System.out.print("Print the matrix after transpose :  ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
    
        }
        
}
