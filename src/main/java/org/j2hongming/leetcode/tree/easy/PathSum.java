package org.j2hongming.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.List;


public class PathSum {

	/**
	 * @author j2hongming
	 * @see https://leetcode.com/problems/path-sum/
	 *
	 */
	public boolean hasPathSum(TreeNode root, int sum) {

		List<Integer> pathSums = new ArrayList<Integer>();
		boolean result = false;

		DFS(root, 0, pathSums);

		for (int pathSum : pathSums) {
			if (pathSum == sum) {
				result = true;
			}
		}

		return result;

	}

	public void DFS(TreeNode root, int pathSum, List<Integer> pathSums) {
		if (root == null)
			return;
		// Leaf
		if (root.left == null && root.right == null) {
			pathSums.add(pathSum + root.val);
		}

		DFS(root.left, pathSum + root.val, pathSums); // L
		DFS(root.right, pathSum + root.val, pathSums); // R
	}
	
	/**
	 * @author boy27910230
	 * @see https://leetcode.com/discuss/10456/accepted-my-recursive-solution-in-java
	 *
	 */
	public boolean hasPathSumElegant(TreeNode root, int sum) {

        if(root == null) return false;

        // Leaf Node
        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

	}

}
