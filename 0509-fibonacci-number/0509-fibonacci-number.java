class Solution {
    public int fib(int n) {
     /*  if(n==0){
        return 0;
       } 
       if(n==1){
        return 1;
       }
       int []dp=new int[n+1];
       dp[0]=0;
       dp[1]=1;
       for(int i=2;i<=n;i++){
        dp[i]+=dp[i-1]+dp[i-2];
       }
       return dp[n];*/
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       if(n==0 || n==1){
        return n;
       }
       if(dp[n]!=-1){
        return dp[n];
       }
       int a=fib(n-1);
       int b=fib(n-2);
       dp[n]=a+b;
       return a+b;
    }
}