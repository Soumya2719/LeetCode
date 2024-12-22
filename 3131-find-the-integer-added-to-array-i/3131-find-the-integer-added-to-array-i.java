class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       int a=findMin(nums1);
       int b=findMin(nums2);
        return b-a;
    }
    public static int findMin(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}