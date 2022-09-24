public class substring {


    public static String  subString(String str, int si, int ei) {
        String substr ="";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }
        return str;
        
    }
    public static void main(String args[]){
    String str = "RohanAditya";
    System.out.println(str.sub String(0,5));
    System.out.println( subString(str, 0, 4));
    //   subString(str, 0, 4)
    }
    
}
