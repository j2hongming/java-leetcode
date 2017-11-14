package org.j2hongming.leetcode.tree.easy;

/**
 * The Class BinaryTreePaths.
 * @author  j2hongming
 * @see https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			TreeNode leftNode = invertTree(root.left);
			TreeNode rightNode = invertTree(root.right);
			TreeNode tmpNode = new TreeNode(leftNode.val);
			tmpNode.left = leftNode.left;
			tmpNode.right = leftNode.right;

			leftNode = rightNode;
			rightNode = tmpNode;

		}
		return root;

	}

}
