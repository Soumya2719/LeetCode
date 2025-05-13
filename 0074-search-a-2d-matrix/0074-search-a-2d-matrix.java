class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         
          for(int i=0;i<matrix.length;){
              int last=matrix[i][matrix[i].length-1];
              if(target<last){
                return bsearch(matrix[i],target);
              }
              else if(target>last){
                     i++;
              }
              else{
                return true;
              }
          }
          return false;
    }
    public static boolean bsearch(int arr[],int k){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]<k){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}