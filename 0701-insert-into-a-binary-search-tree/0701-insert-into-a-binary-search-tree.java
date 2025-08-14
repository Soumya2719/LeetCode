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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         insert(root,val);
         return root;
    }
    public static void insert(TreeNode root,int val){
         TreeNode temp=new TreeNode(val);
          while(true){
            if(val<root.val){
                if(root.left==null){
                    root.left=temp;
                    return;
                }
                else{
                    root=root.left;
                }
            }
            else{
                if(root.right==null){
                    root.right=temp;
                    return;
                }
                else{
                    root=root.right;
                }
            }
          }
    }
}