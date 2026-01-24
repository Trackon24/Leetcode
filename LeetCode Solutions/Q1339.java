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
    long Mod=1000000007L;
    long result=0;
    private long dfs(TreeNode node){
        if(node==null)return 0;
        node.val+=dfs(node.left)+dfs(node.right);
        return node.val;
    }
    public int maxProduct(TreeNode root) {
        long ans=dfs(root);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode value=queue.remove();
            long initial=(ans-value.val)*value.val;
            result=Math.max(result,initial);
            if(value.left!=null)queue.add(value.left);
            if(value.right!=null)queue.add(value.right);
        }
        return (int)(result%Mod);
    }
}