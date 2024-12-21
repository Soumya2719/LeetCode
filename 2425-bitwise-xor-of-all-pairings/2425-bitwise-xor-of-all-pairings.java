class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
      int n1=nums1.length;
      int n2=nums2.length;
      int res1=0;
      int res2=0;
      for(int i=0;i<n1;i++){
          int temp=n2%2;
          if(temp==0){
             res1=0;
          }
          else{
            res1^=nums1[i];
          }
      }
      for(int i=0;i<n2;i++){
          int temp=n1%2;
          if(temp==0){
             res2=0;
          }
          else{
            res2^=nums2[i];
          }
      }
      return res1^res2;
    }
}