public class operation {
    public static int clrBit(int n , int i) {
        int bitMask =~(1<<i);
        return n & bitMask;

    }
    public static void main(String args[]){

        // setBit(10, 2);
        System.out.println(clrBit(12, 2));
    }
    
}
