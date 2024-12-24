class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
           int index=nums[i]-1;
           if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[index])
           swap(nums,i,index);
           else
           i++;
        }
        for(int k=0;k<n;k++){
            if(k!=nums[k]-1)
            return k+1;
        }
        return n+1;
    }
    public static void swap(int arr[],int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
}