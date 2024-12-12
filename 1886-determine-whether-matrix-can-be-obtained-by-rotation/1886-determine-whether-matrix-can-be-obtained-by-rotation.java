class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<3;i++){
            rotate(mat);
            if(isEqual(mat,target))
            return true;
        }
        return false;
    }
    public static void rotate(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }

    }
    public static void reverse(int arr[]){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static boolean isEqual(int mat[][],int tar[][]){
        if(mat.length!=tar.length || mat[0].length!=tar[0].length)
        return false;
        for(int i=0;i<mat.length;i++){
              for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=tar[i][j])
                return false;
              }
        }
        return true;
    }
}