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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int max=Integer.MIN_VALUE;
        int ans=1;
        int level=1;
        while(!queue.isEmpty()){
            int value=0;
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();
                value+=node.val;
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            if(value>max){
                max=value;
                ans=level;
            }
            level++;
        }
        return ans;
    }
}