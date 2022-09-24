import java.io.PrintStream;

public class opps {

   

    /**
     *
     */
    private static final PrintStream OUT = System.out;

    public static void main(String arg[]) {
       
       int n=5;
       int m =5;
       for(int i =1; i<=n;i++){
        for(int j =1; j<=m;j++){
            if(i==1 || i == n || j == 1 || j ==m){
                OUT.print(" * ");
            } else{
                OUT.print(" ");
            }


        }
        OUT.println();
       }
       
        // public 



        // int a =10;
        // int b=5;
        // int temp =a;
        // a= b;
        // b= temp;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

    //   int result =  multiply(3, 7);
    //   System.out.println(result);
    // System.out.println(Factorial(5));
    // System.out.println(Factorial(8));
    // System.out.println(Factorial(9));
    // System.out.println(n { n + 9});
    // System.out.println();
}

}