class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        for(int i=1;i<n;i++){
            res^=nums[i];
        }
        return res;
    }
}