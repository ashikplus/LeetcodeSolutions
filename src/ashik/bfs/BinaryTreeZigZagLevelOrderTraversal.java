package ashik.bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);

		List<List<Integer>> list = zigZagLevelOrder(root);
		System.out.println(list.toString());
	}

	private static List<List<Integer>> zigZagLevelOrder(TreeNode root) {

		if (root == null) {
			return Collections.emptyList();
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		boolean zigZag = false;
		while (true) {
			int sizeOnLevel = queue.size();
			List<Integer> li = new ArrayList<Integer>();
			zigZag = !zigZag;
			if (sizeOnLevel == 0) {
				return list;
			}
			while (sizeOnLevel > 0) {

				TreeNode node = queue.poll();
				li.add(node.val);

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}

				sizeOnLevel--;
			}

			if (zigZag) {
				list.add(li);
			} else {
				Collections.reverse(li);
				list.add(li);
			}
		}
	}

}
