package ashik.linkedlist;

import java.util.Stack;

public class ReversedLinkedList {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode.printList(head);
		System.out.println();
		ListNode afterRemove = reverseList(head);
		System.out.println("After Reverse ..................");
		ListNode.printList(afterRemove);
	}

	private static ListNode reverseList(ListNode head) {

		Stack<ListNode> stack = new Stack<ListNode>();
		
		ListNode current = head;
		
		while(current!=null) {
			stack.add(current);
			current = current.next;
		}
		
		ListNode dummy = new ListNode(0);
		ListNode newCurrent = dummy;

		while (!stack.isEmpty()) {
		    ListNode node = stack.pop();

		    newCurrent.next = node;   
		    newCurrent = newCurrent.next;
		}

		newCurrent.next = null; 

		ListNode newHead = dummy.next;
		return newHead;
	}

}
