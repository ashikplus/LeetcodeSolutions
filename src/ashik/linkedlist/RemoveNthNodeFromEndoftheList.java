package ashik.linkedlist;

import java.util.HashMap;
import java.util.Map;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
}

public class RemoveNthNodeFromEndoftheList {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode.printList(head);
		System.out.println();
		ListNode afterRemove = removeNthFromEnd(head, 5);
		System.out.println("After Remove ..................");
		ListNode.printList(afterRemove);

	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {

		Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
		ListNode current = head;
		int index = 0;

		while (current != null) {
			index++;
			map.put(index, current);
			
			current = current.next;

		}
		int a = n - 1;
		int b = index - a;

		if (b == 1) {
			ListNode listNode = map.get(1);
			head = listNode.next;
			listNode = null;
		} else if (b == index) {
			ListNode listNode = map.get((b - 1));
			listNode.next = null;
		} else {
			ListNode listNode = map.get(b);
			ListNode listNode1 = map.get(b - 1);
			listNode1.next = listNode.next;
			listNode = null;
		}

		return head;

	}

}
