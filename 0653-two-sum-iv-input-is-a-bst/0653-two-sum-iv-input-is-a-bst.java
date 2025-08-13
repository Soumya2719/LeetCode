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
    public boolean findTarget(TreeNode root, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return false;
        }
        q.add(root);
        while(q.size()>0){
            TreeNode temp=q.remove();
            int res=k-temp.val;
            if(isFound(root,res,temp)){
                return true;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        return false;
    }
    public static boolean isFound(TreeNode root,int n,TreeNode not){
       while(root!=null){
          if(root.val==n){
            return root!=not;
          }
          else if(root.val>n){
            root=root.left;
          }
          else{
            root=root.right;
          }
       }
     return false;
    }
}