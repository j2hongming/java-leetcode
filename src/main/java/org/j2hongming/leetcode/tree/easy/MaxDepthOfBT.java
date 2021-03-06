package org.j2hongming.leetcode.tree.easy;

public class MaxDepthOfBT {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
    public int maxDepth(TreeNode root) {
        if(root == null)
          return 0;
        return Math.max( maxDepth(root.left), maxDepth(root.right) ) + 1;
    }
}
