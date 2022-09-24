import java.util.ArrayList;

public class qpractice {

    public static boolean monotonic(ArrayList<Integer> numb){
    //     for(int i =0;i<numb.size();i++){
    //         for(int j =0;j<numb.size();j++){
    //             if(numb.get(i) <= numb.get(j)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    boolean inc = true;
    boolean dec = true;
    for( int i = 0;i<numb.size()-1;i++){
        if(numb.get(i)>numb.get(i+1)){
            return false;
        }
        if(numb.get(i)<numb.get(i+1)){
            return false;
        }
    }
    return inc || dec;
}


    public static void main(String args[]){
ArrayList<Integer> numb =  new ArrayList<>();

numb.add(1);
numb.add(2);
numb.add(2);
numb.add(3);
System.out.println(monotonic(numb));



    }
    
}
