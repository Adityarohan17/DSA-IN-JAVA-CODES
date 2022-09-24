public class LinkedList {
    

    public static class Node{

        int data;
        Node next;
         public Node (int data){
            this.data = data;
            this.next = null;

         }
      

    }
    public static Node head;
    public static Node tail;
    public static int size;
public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;

    }
    

    newNode.next = head;

    head = newNode;

}
public void addLast(int data){
    size++;
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
}
tail.next = newNode;
tail = newNode;
}

public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }

    Node temp = head;
    while(temp != null){
        System.out.print(temp.data +"->");
        temp = temp.next;
    }

System.out.println("null");
}
public  int removeFirst(){
    if(size == 0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        return val;
    }
    int val = head.data;
    head = head.next;
    return val;
}
public int itrSearch(int key){
    Node temp = head;
    int i =0;
    while(temp != null){
        if(temp.data==key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =  curr;
            curr =  next;
        }
        head = prev;
    }
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
        // LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();


        // System.out.println(ll.itrSearch(4));
        // ll.reverse();
        // ll.print(); 

        // // ll.removeFirst();
        // // ll.print();
        // // System.out.println(ll.size);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next =  new Node(3);
        head.next.next.next = new Node(1);
        
        System.out.println(isCycle());


    }

}