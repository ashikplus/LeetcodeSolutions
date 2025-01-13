package ashik.linkedlist;

import ashik.linkedlist.LinkedList.Node;

//Problem no. #Leetcode 160
public class IntersectionNode {

	public static void main(String[] args) {
		
		LinkedList.head = new Node(1);
		LinkedList.head.next = new Node(12);
		LinkedList.head.next.next = new Node(20);
		LinkedList.head.next.next.next = new Node(25);
		
		LinkedList.head2 = new Node(5);
		LinkedList.head2.next = new Node(8);
		LinkedList.head2.next.next = LinkedList.head.next;
		LinkedList.head2.next.next.next = LinkedList.head.next.next;
		LinkedList.head2.next.next.next.next = LinkedList.head.next.next.next;
		
		Node intersectionNode = getIntersectionNode(LinkedList.head, LinkedList.head2);
		System.out.println(intersectionNode.data);
		
		
	}

	private static Node getIntersectionNode(Node head, Node head2) {

		int length = getHeadLength(head);
		
		int length2 = getHead2Length(head2);
		
		while(length > length2) {
			
			length--;
			head = head.next;
		}
		
		while(length2 > length) {
			
			length2--;
			head2 = head2.next;
		}
		
		while(head != head2) {
			
			head = head.next;
			head2 = head2.next;
		}
		return head;
		
	}

	private static int getHead2Length(Node head2) {

		Node h2 = head2;
		int count = 0;
		
		while(h2 != null) {
			count++;
			h2 = h2.next;
		}
		return count;
	}

	private static int getHeadLength(Node head) {

		Node h1 = head;
		int count = 0;
		
		while(h1 != null) {
			count++;
			h1 = h1.next;
		}
		return count;
	}

}
