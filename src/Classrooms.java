import LinkedList.Node;

// import java.util.LinkedList;
public class Classrooms {
    

    public void zigZag(){
        Node slow = head;
        Node fast =  head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;
         
        // REverse //
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
          

        // ALT MERGE //
        while(next != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
            left.next = right;
            left.next
        }
          
    }
    public static void main(String args[]){

        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addFirst(0);
        // // ll.add(5);
    
        // System.out.println(ll);

        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll);



    }
}
