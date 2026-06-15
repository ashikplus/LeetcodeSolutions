package ashik.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		
		TreeNode root = null; //new TreeNode();
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(2);
//		root.right.right = new TreeNode(3);

		int depth = minDepth(root);
		System.out.println(depth);
	}

	private static int minDepth(TreeNode root) {

		if (root == null) return 0;
		
		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		int depth = 0;

		while (true) {

			int noOfNodeOnLevel = queue.size();
			if (noOfNodeOnLevel == 0) {
				return depth;
			}
			depth++;
			while (noOfNodeOnLevel > 0) {
				TreeNode node = queue.poll();

				if (node.left == null && node.right == null) {
					return depth;
				}
				
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

				noOfNodeOnLevel--;
			}
			
		}
	}

}
