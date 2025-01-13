package ashik.linkedlist;

import ashik.linkedlist.LinkedList.Node;

//Problem no. #Leetcode 203
public class removeElements {

	public static void main(String[] args) {

		LinkedList.head = new Node(1);
		LinkedList.head.next = new Node(1);
		LinkedList.head.next.next = new Node(20);
		LinkedList.head.next.next.next = new Node(25);
		LinkedList.head.next.next.next.next = new Node(1);
//		LinkedList.head.next.next.next.next.next = new Node(20);
		
		int val = 20;
		
		Node removeElements = removeElements(LinkedList.head, val);
		
		int count=0;
		while(removeElements != null) {
			count++;
			removeElements = removeElements.next;
		}
		
		System.out.println("count "+count);
	}

	private static Node removeElements(Node head, int val) {
		
		Node dummy = new Node(-1);
		dummy.next = head;
		
		Node current = dummy;
		
		while(current.next != null) {
			
			if(current.next.data == val) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		return dummy.next;
	}

}
