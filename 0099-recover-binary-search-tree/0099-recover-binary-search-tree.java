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
    TreeNode f;
    TreeNode s;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(f!=null && s!=null){
            int temp=f.val;
            f.val=s.val;
            s.val=temp;
        }
    }
    void inorder(TreeNode root){
        if(root==null)
          return;

        inorder(root.left);
        if(prev!=null && root.val<prev.val && f==null){
            f=prev;
            s=root;
        }
        if(prev!=null && root.val<prev.val && f!=null){
            s=root;
        }
        prev=root;
        inorder(root.right);
    }
}