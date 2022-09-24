public class bits {

    public static void oddOrEven(int n){
        int bitMask =1; 
        if((n & bitMask) == 0 ){
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }

        
    }
    
    public static void main(String args[]) {
        // System.out.println((4>>1));
        oddOrEven(3);
        oddOrEven(6);
        oddOrEven(8);
        
    }
}
