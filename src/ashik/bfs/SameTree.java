package ashik.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class SameTree {

	public static void main(String[] args) {

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(2);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(2);
		
		boolean isSame = isSameTree(root1, root2);
		System.out.println(isSame);
		
	}

	private static boolean isSameTree(TreeNode root1, TreeNode root2) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root1);
		queue.add(root2);
		
		while(!queue.isEmpty()) {
			
			TreeNode first = queue.poll();
			TreeNode second = queue.poll();
			
			if(first == null && second == null) {
				continue;
			}else if(first == null || second == null || first.val != second.val) {
				return false;
			}
			
			queue.add(first.left);
			queue.add(second.left);
			queue.add(first.right);
			queue.add(second.right);
		}
		return true;
	}

}
