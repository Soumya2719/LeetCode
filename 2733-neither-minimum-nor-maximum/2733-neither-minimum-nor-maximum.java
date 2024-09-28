class Solution {
    public int findNonMinOrMax(int[] nums) {
     int n=nums.length;
     if(n<3){
        return -1;
     }
     int max=Math.max(nums[0],nums[1]);
     int min=Math.min(nums[0],nums[1]);
     int c=nums[2];
     if(max>c && min<c){
        return c;
     }
    if(c<min){
        return min;
    }
    if(c>max){
        return max;
    }
    return -1;
    }
}