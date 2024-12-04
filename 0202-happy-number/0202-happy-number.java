class Solution {
    public boolean isHappy(int n) {
        int res=0;
        if(n==1)
        return true;
      while(n>2){
         res=digitSum(n);
         n=res;
      }
      if(res==1)
      return true;
      return false;
    }
    public static int digitSum(int n){
        int res=0;
        while(n>0){
            res+=Math.pow(n%10,2);
            n/=10;
        }
        return res;
    }
}