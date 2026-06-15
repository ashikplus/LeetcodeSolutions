package ashik.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);

		int depth = maxDepth(root);
	}

	private static int maxDepth(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		int depth = -1;

		while (true) {

			int noOfNodeOnLevel = queue.size();
			if (noOfNodeOnLevel == 0) {
				return depth;
			}
			while (noOfNodeOnLevel > 0) {
				TreeNode node = queue.poll();

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

				noOfNodeOnLevel--;
			}
			depth++;
		}
	}

}
