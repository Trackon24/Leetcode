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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> bst=new ArrayList<>();
        inorder(root, bst);
        return binarysearch(bst, 0, bst.size()-1);
    }
    public void inorder(TreeNode root, List<Integer> bst){
        if(root==null)return;
        inorder(root.left,bst);
        bst.add(root.val);
        inorder(root.right,bst);
    }
    public TreeNode binarysearch(List<Integer> bst, int left, int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode val=new TreeNode(bst.get(mid));
        val.left=binarysearch(bst,left,mid-1);
        val.right=binarysearch(bst,mid+1,right);
        return val;
    }
}