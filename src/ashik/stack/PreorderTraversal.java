package ashik.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ashik.stack.LinkedList.TreeNode;

//Leetcode 144
public class PreorderTraversal {

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
		
		stack.push(head);
		
		while(!stack.isEmpty()) {

			head = stack.pop();
			output_arr.add(head.data);
			if(head.right != null) {
				stack.push(head.right);
			}
			
			if(head.left != null) {
				stack.push(head.left);
			}
		}
		
		return output_arr;
	}

}
