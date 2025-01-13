package ashik.linkedlist;

public class LinkedList {

	static Node head;
	static Node head2;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
	public static void main(String[] args) {

		LinkedList.head = new Node(1);
		LinkedList.head.next = new Node(1);
		LinkedList.head.next.next = new Node(4);
		LinkedList.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        LinkedList.printList(LinkedList.head);
        
//        LinkedList.deleteDuplicates(LinkedList.head);
	}

}
