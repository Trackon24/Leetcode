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
    public boolean isBalanced(TreeNode root) {
        int a=depth(root);
        if(a==-1)return false;
        else return true;
    }
    private int depth(TreeNode val){
        if(val==null)return 0;
        int left=depth(val.left);
        if(left==-1)return -1;
        int right=depth(val.right);
        if(right==-1)return -1;
        return 1+Math.max(left,right);
    }
}