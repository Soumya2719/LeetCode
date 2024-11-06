class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       for(int i=1;i<=k;i++){
        int index=findMin(nums);
        nums[index]=multiplier*nums[index];
       }
       return nums;
    }
    public static int findMin(int arr[]){
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            if(min>=arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}