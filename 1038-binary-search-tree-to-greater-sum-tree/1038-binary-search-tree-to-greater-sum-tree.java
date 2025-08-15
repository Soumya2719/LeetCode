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
    int gsum=0;
    public TreeNode bstToGst(TreeNode root) {
        sum(root);
        return root;
    }
    public void sum(TreeNode root){
        if(root==null){
            return;
        }
        sum(root.right);
        gsum+=root.val;
        root.val=gsum;
        sum(root.left);
    }
}