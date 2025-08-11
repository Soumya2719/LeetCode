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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.remove();
                ls.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            list.add(ls);
        }
        Collections.reverse(list);
        return list;
    }
}