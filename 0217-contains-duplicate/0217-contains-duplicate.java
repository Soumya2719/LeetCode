class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==2){
           if(nums[0]==nums[1]){
            return true;
           }
        }
        for(int i=1;i<n-1;i++){
          if(nums[i]==nums[i-1] || nums[i]==nums[i+1]){
          return true;
          }
        }
        return false;
    }
}