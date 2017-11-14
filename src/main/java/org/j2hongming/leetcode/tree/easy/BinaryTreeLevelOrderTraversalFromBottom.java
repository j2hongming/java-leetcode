package org.j2hongming.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversalFromBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        
        if(root == null){
          return result;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		int curLevelNodeNum = 0;
		
        while(!q.isEmpty()){
            
           List<Integer> levelRs = new ArrayList<Integer>(); 
           curLevelNodeNum = q.size();
           for( int i = 0 ; i < curLevelNodeNum ; i++ ){
               TreeNode peek = q.poll();
               levelRs.add(peek.val);
               if(peek.left!=null){
                   q.offer(peek.left);
               }
               if(peek.right!=null){
                   q.offer(peek.right);
               }
           }
           stack.push(levelRs);
        }
        
        while( !stack.isEmpty() ){
            result.add( stack.pop() );
        }
        return result;
    }
}
