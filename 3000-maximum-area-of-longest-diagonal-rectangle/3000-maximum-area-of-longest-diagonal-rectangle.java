class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0.0;
        int index=0;
       for(int i=0;i<dimensions.length;i++){
        int n1=dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
        if(max<=Math.sqrt(n1)){
            max=Math.sqrt(n1);
            index=i;
        }
       }
       int res=dimensions[index][0]*dimensions[index][1];
       return res;
    }
}