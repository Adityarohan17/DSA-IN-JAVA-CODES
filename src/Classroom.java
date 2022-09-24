import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Classroom {
    

//     public static void main(String args[]){
//     ArrayList<Integer> list = new ArrayList<>();

// // ADD FUNCTION //
// list.add(1);
// list.add(2);
// list.add(3);
// list.add(4);
// list.add(5);

// System.out.println(list);

// // Get function //

// int element =list.get(3);
// System.out.println(element);

// // REMOVE FUNCTION //
// int elementValue = list.remove(3);
// System.out.println(elementValue);
// System.out.println(list);

// // SET FUNCTION //
// list.set(2, 10);
// System.out.println(list);

// // CONTAIMN FUNCTION //
// // list.contains(4);
// System.out.println(list.contains(4));

// // SIZE FUNCTION //

// System.out.println(list.size()); 

//     }


// // ACTIVITY SELECTION //
// public static void main(String args[]){

//     int start [] = {1,3,0,5,8,5};
//     int end[] = {2,4,6,7,9,9};

//     int maxAct = 0;
//     ArrayList<Integer> ans = new ArrayList<>(); 

//     maxAct = 1;
//     ans.add(0);
//     int lastEnd = end[0];
//     for(int i =1;i<end.length;i++){
//         if(start[i] >= lastEnd){
//             maxAct++;
//             ans.add(i);
//             lastEnd =  end[i];
//         }

//     }

// System.out.println("max activities = " + maxAct);
// for(int i =0;i<ans.size();i++){
// System.out.print( "A" + ans.get(i) + " ");
// }
// System.out.println();

// }

// public static void main(String args[]){
//     int val[] =  {60,100,120};
//     int weight[] = {10,20,30};
//     int W = 50;

//     double ratio[][] = new double[val.length][2];
//     for(int i =0;i<val.length;i++){
//         ratio[i][0] = i;
//         ratio[i][1] = val[i]/(double)weight[i];

//     }
//     Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
//     int capacity = W;
//     int finalVal = 0;
// for(int i = ratio.length-1;i>=0;i--){
//     // int capacity = W;
//     int idx = (int)ratio[i][0];
//     if(capacity >=weight[idx]){
//         finalVal += val[idx];
//         capacity -= weight[idx];

//     }else{
//         finalVal += (ratio[i][1] * capacity);
//         capacity = 0;
//         break;

//     }





// }

// System.out.println("final value = " + finalVal);

// }
static class Node {
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left= null;
        this.right = null;
    }
}

    // public static int count( Node root){
    //     if(root==null){
    //         return 0;

    //     }
    //     int leftCount = count(root.left);
    //     int rightCount = count(root.right);
    // return leftCount + rightCount +1;

    // }
    // public static int sum(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftSum = sum(root.left);
    //     int rightSum = sum(root.right);
    //     return leftSum+ rightSum+root.data;

    // }
    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null);{
            return true;
        

        } else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
            return true;   
    }
public static boolean isSubtree(Node root, Node subRoot){
    if(root.data == subRoot.data){
        if(isIdentical(root, subRoot)){
            return true;
        }

    }
    boolean leftAns = isSubtree(root.left, subRoot);
    boolean rightAns = isSubtree(root.right, subRoot);
return leftAns || rightAns;
}
 
public static void main(String args[]){

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right= new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);


    // System.out.println(count(root));
    // System.out.println(sum(root));

    Node subRoot =  new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);

}
}
