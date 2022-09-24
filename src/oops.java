public class oops {
    public static void main(String args[]) {

        calculator calc = new calculator();
        System.out.println(calc.sum(2, 4));
        System.out.println(calc.sum(1.5f, 2.5f));
        
    }
    // calculator calc = new calculator();
    
    
}

class calculator{
    int sum(int a, int b){
    return a+b;
    }

 float sum(float a, float b){
    return a+ b;
 }
}
