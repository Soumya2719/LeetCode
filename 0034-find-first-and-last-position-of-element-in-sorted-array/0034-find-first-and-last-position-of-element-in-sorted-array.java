class Solution {
    public int[] searchRange(int[] nums, int target) {
       int arr[]={-1,-1};
       int cnt=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            arr[cnt++]=i;
        }
       }
       return arr;
    }
}