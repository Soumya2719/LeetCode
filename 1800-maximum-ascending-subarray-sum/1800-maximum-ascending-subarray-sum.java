class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum;
        int maxSum=0;

        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                if(isAscending(nums,i,j))
                sum+=nums[j];
                else
                break;
            }
            maxSum=Math.max(maxSum,sum);
        }
            return maxSum;
    }
    public static boolean isAscending(int nums[],int st,int end){
        for(int i=st;i<end;i++){
            if(nums[i+1]<=nums[i])
            return false;
        }
        return true;
    }

}