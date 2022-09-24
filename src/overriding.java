public class overriding {
    
    public static void main (String args[]) {
        dear d1 = new dear();
        d1.eat();
        
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
