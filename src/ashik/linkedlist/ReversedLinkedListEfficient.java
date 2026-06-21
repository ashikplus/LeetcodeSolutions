package ashik.linkedlist;

public class ReversedLinkedListEfficient {

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
		
		ListNode current = head;
		ListNode prev = null;
		
		while(current!=null) {
			
			ListNode nextTemp = current.next;
			current.next = prev;
			prev = current;
			current = nextTemp;
		}
		return prev;
	}

}
