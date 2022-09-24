public class Linkelist2 {

public static boolean isCycle(){

    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
slow= slow.next;
fast = fast.next;
if(slow == fast){
    return true;
}

    }
return false;

}
  




    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next =  new Node(3);
        head.next.next.next = new Node(1);
        
        System.out.println(isCycle());




    }
    
}
