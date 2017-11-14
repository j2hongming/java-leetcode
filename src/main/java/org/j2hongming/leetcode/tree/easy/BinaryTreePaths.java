package org.j2hongming.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class BinaryTreePaths.
 * @author  Cheng_Zhang
 * @see https://leetcode.com/discuss/65362/my-concise-java-dfs-solution
 */
public class BinaryTreePaths {

    /**
     * Binary tree paths.
     *
     * @param root the root
     * @return the list
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        DFS(root, "", paths);
        return paths;
    }
    
    /**
     * Dfs.
     *
     * @param root the root
     * @param path the path
     * @param paths the paths
     */
    public void DFS(TreeNode root, String path, List<String> paths) {
        if(root == null) return;
        
        // Leaf
        if(root.left == null && root.right == null){
            paths.add(path + root.val);
        }
        DFS(root.left, path + root.val + "->", paths); // L
        DFS(root.right, path + root.val + "->", paths); // R
    }
}
