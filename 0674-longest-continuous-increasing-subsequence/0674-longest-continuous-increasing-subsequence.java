class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int count=1;
        int maxC=1;
      for(int i=1;i<n;i++){
        if(nums[i]>nums[i-1]){
           count++;
           maxC=Math.max(maxC,count);
         } 
      else{
        count=1;
      } 
      }
      return maxC; 
    }
}