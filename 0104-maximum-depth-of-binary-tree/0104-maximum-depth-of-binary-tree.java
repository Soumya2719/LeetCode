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
    public int maxDepth(TreeNode root) {
         Queue<TreeNode> q=new LinkedList<>();
         if(root==null){
            return 0;
         }
         q.add(root);
         int count=0;
         while(q.size()>0){
            int n=q.size();

            for(int i=1;i<=n;i++){
                TreeNode rem=q.remove();
                if(rem.left!=null){
                    q.add(rem.left);
                }
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
            count++;
         }
         return count;
    }
}