package ashik.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		
		root.left.left.left = new TreeNode(5);
		root.left.left.right = new TreeNode(6);
		
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(8);

		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(4);
		
		root.right.left.left = new TreeNode(5);
		root.right.left.right = new TreeNode(6);
		
		root.right.right.left = new TreeNode(7);
		root.right.right.right = new TreeNode(8);

		boolean isSemmetic = isSymmetric(root);
//		System.out.println(isSemmetic);

	}

	private static boolean isSymmetric(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root.left);
		queue.add(root.right);
		int count = 0;

		while (!queue.isEmpty()) {

			count++;
			TreeNode left = queue.poll();
			TreeNode right = queue.poll();

			if (left == null && right == null) {
				continue;
			} else if (left == null || right == null || left.val != right.val) {
				System.out.println(count);
				return false;
			}

			queue.add(left.left);
			queue.add(right.right);
			queue.add(left.right);
			queue.add(right.left);
		}
		System.out.println(count);

		return true;
	}

}
