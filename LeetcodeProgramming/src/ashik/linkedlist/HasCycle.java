package ashik.linkedlist;

import ashik.linkedlist.LinkedList.Node;

public class HasCycle {
	
	public static boolean hasCycle(Node head) {
        
		Node slow = head, fast = head;

        while(slow != null && fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {

		LinkedList.head = new Node(1);
		LinkedList.head.next = new Node(12);
		LinkedList.head.next.next = new Node(20);
		LinkedList.head.next.next.next = new Node(25);
//		LinkedList.head.next.next.next.next = LinkedList.head;
		
		boolean b = HasCycle.hasCycle(LinkedList.head);
		
		System.out.println(b);
	}

}
