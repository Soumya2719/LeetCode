class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
       } 
        int ans[]=new int[k];
     ArrayList<Integer> arr=new ArrayList<>();
       int j=0;
       while(k-->0){
            arr.add(pq.remove());
       }
      
       for(int i=0;i<nums.length;i++){
        if(arr.contains(nums[i])){
            ans[j++]=nums[i];
            arr.remove(Integer.valueOf(nums[i]));
        }
       }
       return ans;
    }
}