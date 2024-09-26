import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    int a1=nums1.length;
    int a2=nums2.length;
    int c=a1+a2;
    
    int arr[]=new int[c];
    for(int i=0;i<a1;i++){
        arr[i]=nums1[i];
    }
    for(int i=0;i<a2;i++){
        arr[a1+i]=nums2[i];
    }
    Arrays.sort(arr);
    int length=arr.length;
    if(length%2!=0){
          length=(length)/2;
        double d=arr[length];
         return d;
    }
    else{
          int a=(a1+a2)/2;
          int b=a-1;
          double v=arr[a];
          double w=arr[b];
          return (v+w)/2;
    }
    }
}