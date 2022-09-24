import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;
public class SoortingAL {
    

    public static void main (String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(6);
        List.add(9);
        List.add(4);
        List.add(7);
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);

        Collections.sort(List, Collections.reverseOrder());
        System.out.println(List);
    
    }
}
