package ashik.linkedlist;

import java.util.ArrayList;
import java.util.List;

import ashik.linkedlist.LinkedList.Node;

public class RemoveDuplicates {
	
	public static Node deleteDuplicates(Node head) {
        
        List<Integer> list = new ArrayList<Integer>();
		
		Node current = head;
		Node prev = head;
		
		if(current != null) {
			list.add(current.data);
			current = head.next;
		}else {
			return head;
		}
		while(current != null) {
			
			if(list.contains(current.data)) {
				
				current = current.next;
				
				if(current == null) {
					prev.next = current;
				}
			}else {
				
				list.add(current.data);
				prev.next = current;
				prev = current;
				current = current.next;
			}
			
		}
        return head;
    }

	public static void main(String[] args) {
		
		LinkedList.head = new Node(1);
		LinkedList.head.next = new Node(1);
		LinkedList.head.next.next = new Node(20);
		LinkedList.head.next.next.next = new Node(20);
		LinkedList.head.next.next.next.next = new Node(20);
		LinkedList.head.next.next.next.next.next = new Node(22);

        System.out.println("Given linked list");
        LinkedList.printList(LinkedList.head);
        System.out.println();
        
        RemoveDuplicates.deleteDuplicates(LinkedList.head);
        
        System.out.println("Distinct linked list");
        LinkedList.printList(LinkedList.head);
	}

}
