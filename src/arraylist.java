
import java.util.Collections;
import java.util.ArrayList;
// import java.util.Collection;

import javax.print.DocFlavor.STRING;
public class arraylist {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list =  new ArrayList<>();
    // arraylist<Float> list3 =new arraylist() ;  
    // print the elemet //
    list.add(0);
    list.add(1);
    list.add(2);
    System.out.println(list);
    // list.get(2);
    // System.out.println(list);


    // for get opertaion //
    int element = list.get(2);
    System.out.println(element);


    // for add element in between //

list.add(2,3);
System.out.println(list);

// list.set(index: 1, element: 10);

// System.out.println(list);
list.set(1, 10);
System.out.println(list);

// for removing 
list.remove(2);
System.out.println(list);

// for length //
int size = list.size();
System.out.println(size);
Collections.sort(list);
System.out.println(list);

    }
}
