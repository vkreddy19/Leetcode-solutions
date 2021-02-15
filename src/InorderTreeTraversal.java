public class InorderTreeTraversal {
    public static void main(String args[]){
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        head.left = n2;
        n2.left = n1;
        printInorder(head);
    }

    public static void printInorder(Node head){

        if(head == null)
            return;
        System.out.println(head.val);
        printInorder(head.left);
        printInorder(head.right);
    }

}



class Node {
     int val;
    Node left;
    Node right;
    Node(int x) { val = x; }
 }