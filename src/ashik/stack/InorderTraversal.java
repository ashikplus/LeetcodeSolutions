package ashik.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ashik.stack.LinkedList.TreeNode;

public class InorderTraversal {

	public static void main(String[] args) {

		LinkedList.head = new TreeNode(1);
		LinkedList.head.left = new TreeNode(2);
		LinkedList.head.right = new TreeNode(3);
		LinkedList.head.right.left = new TreeNode(4);
		LinkedList.head.right.right = new TreeNode(5);
		
		List<Integer> traversal = traversal(LinkedList.head);
	}

	private static List<Integer> traversal(TreeNode head) {

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> output_arr = new ArrayList<>();
		
		if(head == null) {
			return output_arr;
		}
		
		TreeNode current = head;
		
		while(current  != null || !stack.isEmpty()) {
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			output_arr.add(current.data);
			current = current.right;
		}
		
		return output_arr;
	}

}
