/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private static int helper(TreeNode root,int currval){
        if(root==null) return 0;
        currval=currval*10+root.val;
        if(root.left==null&&root.right==null){
            return currval;
        }
        return helper(root.left,currval)+helper(root.right,currval);
        
    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
}