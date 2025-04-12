class Solution {
    public int maxOperations(int[] nums) {
        int count=1;
        int sumPrev=nums[0]+nums[1];
        for(int i=2;i<nums.length-1;i+=2){
            if(sumPrev==(nums[i]+nums[i+1])){
                count++;
                sumPrev=nums[i]+nums[i+1];
            }
            else{
                break;
            }
        }
        return count;
    }
}