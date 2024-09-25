class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=1;i<n-1;i++){
            if(nums[0]!=nums[1]){
                return nums[0];
            }
            else if(nums[n-1]!=nums[n-2]){
                return nums[n-1];
            }
            else if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
      return -1;
    }
}