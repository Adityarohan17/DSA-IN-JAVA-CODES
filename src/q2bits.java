public class q2bits {

    public static int clrIbit(int n , int i) {
        int bitMask = -1<<i;
        return n&bitMask;
        
    }
    public static void main(String args[]) {
        // clrIbit(15, 2);
        System.out.println(clrIbit(15, 2));

        
    }
    
}
