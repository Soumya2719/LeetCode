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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(q.size()>0){
            List<Integer> temp=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x=q.remove();
                temp.add(x.val);
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            int res=findMax(temp);
            list.add(res);
        }
        return list;
    }
    public static int findMax(List<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i:list){
            max=Math.max(max,i);
        }
        return max;
    }
}