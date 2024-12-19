class Solution {
    public int maxChunksToSorted(int[] arr) {
       int count=0,prefixSum=0,sortedSum=0;

       for(int i=0;i<arr.length;i++){
          prefixSum+=arr[i];
          sortedSum+=i;

          if(prefixSum==sortedSum)
          count++;
       }
       return count;
    }
}