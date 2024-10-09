class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
       boolean incr=true;
       boolean decre=true;
       for(int i=1;i<n;i++){
        if(nums[i]>nums[i-1])
             incr=false;
        if(nums[i]<nums[i-1])
             decre=false;
       }  
       return incr||decre; 
    }
}