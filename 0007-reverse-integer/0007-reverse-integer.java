class Solution {
    public int reverse(int num) {
        int rev=0;
        while(num!=0){
           int rem=num%10;
           rev=rev*10+rem;
           num=num/10; 
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
    }
}