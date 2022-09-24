public class q4 {
    
    public static int countSetBits(int n) {
        int count =0;
        // int bitMask
        while(n>0){
            if((n &1) != 0){
                count++;
            }
            n = n>>1;
        }
return count;
        
    }
    public static void main(String args[]){
        // countSetBits(8);
        System.out.println( countSetBits(8));

    }
}
