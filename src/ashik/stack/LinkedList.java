package ashik.stack;

public class LinkedList {

	static TreeNode head;
	static TreeNode head2;

    static class TreeNode {

        int data;
        TreeNode head;
        TreeNode left;
        TreeNode right;

        TreeNode(int d)
        {
            data = d;
            left = null;
            right = null;
            head = null;
        }
    }
    
//    static void printList(Node node)
//    {
//        while (node != null) {
//            System.out.print(node.data + " ");
//            node = node.next;
//        }
//    }
    
	public static void main(String[] args) {

//		LinkedList.head = new Node(1);
//		LinkedList.head.next = new Node(1);
//		LinkedList.head.next.next = new Node(4);
//		LinkedList.head.next.next.next = new Node(20);
//
//        System.out.println("Given linked list");
//        LinkedList.printList(LinkedList.head);
//        
////        LinkedList.deleteDuplicates(LinkedList.head);
	}

}
