class Solution {
    public int numberOfMatches(int n) {
       int sum=0;
       int num=n;
        while(n!=1){
            if(n%2==0){
                n/=2;
                sum+=n;
            }
            else{
                n=n/2;
                sum+=n;
                n+=1;
            }
        }
        return sum;
    }
}