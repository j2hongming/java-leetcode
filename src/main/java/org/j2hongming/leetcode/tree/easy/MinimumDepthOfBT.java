package org.j2hongming.leetcode.tree.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBT {

	/**
	 * @author t.allen
	 * @see https://leetcode.com/discuss/6308/my-solution-used-level-order-traversal
	 */
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		int depth = 1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode current;
		TreeNode levelEndMark = new TreeNode(0);
		queue.add(root);
		queue.add(levelEndMark);

		while (!queue.isEmpty()) {
			current = queue.poll();

			// Level End
			if (current.equals(levelEndMark)) {
				// hava other node
				if (!queue.isEmpty()) {
					depth++;
					queue.add(levelEndMark);
				}
				continue;
			}

			// leaf
			if (current.left == null && current.right == null) {
				return depth;
			}

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

		return depth;
	}

	/**
	 * @author andyreadsall
	 * @see https://leetcode.com/discuss/25060/my-4-line-java-solution
	 */
	public int minDepthRecusive(TreeNode root) {
		if (root == null)
			return 0;
		// Case 1: have one child
		if (root.left == null)
			return minDepthRecusive(root.right) + 1;
		if (root.right == null)
			return minDepthRecusive(root.left) + 1;
		
		// Case 2: have both child
		return Math.min(minDepthRecusive(root.left), minDepthRecusive(root.right)) + 1;
	}
}
