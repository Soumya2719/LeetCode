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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> list=new ArrayList<>();
       Queue<TreeNode> q=new LinkedList<>();
       if(root==null){
        return list;
       }
       q.add(root);
        while(q.size()>0){
            int n=q.size();
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=1;i<=n;i++){
                TreeNode rem=q.remove();
                 temp.add(rem.val);
                if(rem.left!=null){
                    q.add(rem.left);
                }
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}