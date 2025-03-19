class Solution {
    public int minOperations(int[] nums) {
       int i=0;
       int count=0;
       while(i<nums.length-2){
          if(nums[i]==1){
            i++;
          }
          else{
            int a=i;
            int b=i+1;
            int c=i+2;
            nums[a]=nums[a]^1;
            nums[b]=nums[b]^1;
            nums[c]=nums[c]^1;
           i++;
           count++;
          }
       }
         int sum = 0;
        for (int num : nums) sum += num;
        if (sum == nums.length) return count;
        return -1;
    }
}