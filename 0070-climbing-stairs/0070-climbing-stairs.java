class Solution {
    public int climbStairs(int n) {
       if(n==1 || n==2){
        return n;
       }
       int dp[]={1,2};
       for(int i=3;i<n+1;i++){
       final int res=dp[0]+dp[1];
        dp[0]=dp[1];
        dp[1]=res;
       }
       return dp[1];
    }
}