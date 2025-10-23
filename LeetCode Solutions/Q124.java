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
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }
    private int helper(TreeNode node){
        if(node==null)return 0;
        int left=Math.max(helper(node.left),0);
        int right=Math.max(helper(node.right),0);
        int path=node.val+left+right;
        res=Math.max(res,path);
        return node.val+Math.max(left,right);
    }
}