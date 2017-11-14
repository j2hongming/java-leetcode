package org.j2hongming.leetcode.tree.easy;

/**
 * The Class BinaryTreePaths.
 * @author  jingzhetian
 * @see https://leetcode.com/discuss/44946/my-java-solution
 */
public class BSTLowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if( p.val < root.val && q.val < root.val){
            // Left Subtree
            return lowestCommonAncestor(root.left, p , q);
        }
        else if( p.val > root.val && q.val > root.val ){
            // Right Subtree
            return lowestCommonAncestor(root.right, p , q);           
        }
        else{
            return root;
        }
    }
}
