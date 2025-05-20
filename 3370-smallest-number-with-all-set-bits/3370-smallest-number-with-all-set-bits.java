class Solution {
    public int smallestNumber(int n) {
        String bin=Integer.toString(n,2);
       int len=bin.length();
       int res=(int)(Math.pow(2,len))-1;
       return res;
    }
}