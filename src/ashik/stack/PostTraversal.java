package ashik.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ashik.stack.LinkedList.TreeNode;

//Leetcode 145
public class PostTraversal {

	public static void main(String[] args) {

		LinkedList.head = new TreeNode(1);
		LinkedList.head.left = new TreeNode(2);
		LinkedList.head.right = new TreeNode(3);
		LinkedList.head.right.left = new TreeNode(4);
		LinkedList.head.right.right = new TreeNode(5);
		
		List<Integer> traversal = traversal(LinkedList.head);
	}

	private static List<Integer> traversal(TreeNode head) {

		 List<Integer> result = new ArrayList<>();
	        if (head == null) {
	            return result;
	        }

	        // Create two stacks
	        Stack<TreeNode> stk1 = new Stack<>();
	        Stack<TreeNode> stk2 = new Stack<>();

	        // Push root to first stack
	        stk1.push(head);
	        TreeNode curr;

	        // Run while first stack is not empty
	        while (!stk1.isEmpty()) {

	            // Pop from stk1 and push it to stk2
	            curr = stk1.pop();
	            stk2.push(curr);

	            // Push left and right children of 
	            // the popped node
	            if (curr.left != null) {
	                stk1.push(curr.left);
	            }
	            if (curr.right != null) {
	                stk1.push(curr.right);
	            }
	        }

	        // Collect all elements from second stack
	        while (!stk2.isEmpty()) {
	            curr = stk2.pop();
	            result.add(curr.data);
	        }

	        return result;
	}

}
