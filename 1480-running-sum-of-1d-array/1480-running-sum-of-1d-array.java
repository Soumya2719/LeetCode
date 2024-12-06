class Solution {
    public int[] runningSum(int[] nums) {
        int pf[]=new int[nums.length];
        pf[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        return pf;
    }
}