class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col=0;
        int row=matrix.length-1;

        while(row>=0 && col<matrix[0].length){
            if(target==matrix[row][col]){
                return true;
            }
            else if(target>matrix[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
      return false;
    }
}