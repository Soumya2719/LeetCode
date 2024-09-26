class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int y=x;
      while(x>0){
        int r=x%10;
        sum=sum*10+r;
        x=x/10;
      }
            if(sum==y)
            return true;
            else
            return false;
    }
}