class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
   public static void reverse(int arr[],int sp,int ep){
    while(sp<ep){
        int temp=arr[sp];
        arr[sp]=arr[ep];
        arr[ep]=temp;
        sp++;
        ep--;
    }
   }
   }
