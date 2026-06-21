package ashik.bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);

		List<List<Integer>> list = levelOrder(root);
		System.out.println(list.toString());
	}

	private static List<List<Integer>> levelOrder(TreeNode root) {

		if(root == null) {
			return Collections.emptyList();
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(root);
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		while(true) {
			int sizeOnLevel = queue.size();
			List<Integer> li = new ArrayList<Integer>();
			if(sizeOnLevel == 0) {
				return list;
			}
			while(sizeOnLevel > 0) {
				
				TreeNode node = queue.poll();
				li.add(node.val);
				
				if(node.left!=null) {
					queue.add(node.left);
				}
				
				if(node.right!=null) {
					queue.add(node.right);
				}
				
				sizeOnLevel--;
			}
			list.add(li);
		}
	}

}
