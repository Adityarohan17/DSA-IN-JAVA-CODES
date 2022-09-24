public class rbasics {
    
    public static  void printDec(int n) {
        if(n==10){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDec(n+1);
        
    }
    public static void main(String args[]) {

        int n =1;
        printDec(n);
        
    }

}
