class Solution {
    public int divide(int dividend, int divisor) {
        long ans1=(long)dividend/divisor;
       int ans=dividend/divisor;
       if(ans1>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
       }
       if(ans1<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
       }
       return ans;
    }
}