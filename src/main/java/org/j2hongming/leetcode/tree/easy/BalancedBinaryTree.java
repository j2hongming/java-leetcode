package org.j2hongming.leetcode.tree.easy;

public class BalancedBinaryTree {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    public boolean isBalanced(TreeNode root) {
	        if ( root == null )
				return true;
	        if ( root.left == null )
	            return (maxDepthRecusive(root.right) <= 1 );
	        if ( root.right == null )
	            return (maxDepthRecusive(root.left) <= 1 );
	            
	        int leftChildDepth = maxDepthRecusive(root.left);
	        int rightChildDepth = maxDepthRecusive(root.right);
	        return isBalanced(root.left) && isBalanced(root.right) && (Math.abs(leftChildDepth - rightChildDepth) <= 1) ;
	    }
	    
	    public int maxDepthRecusive(TreeNode root) {
			if (root == null)
				return 0;
			// Case 1: have one child
			if (root.left == null)
				return maxDepthRecusive(root.right) + 1;
			if (root.right == null)
				return maxDepthRecusive(root.left) + 1;
			
			// Case 2: have both child
			return Math.max(maxDepthRecusive(root.left), maxDepthRecusive(root.right)) + 1;
		}
	
}
