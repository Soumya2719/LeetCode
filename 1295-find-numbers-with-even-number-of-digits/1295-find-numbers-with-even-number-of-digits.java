class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
     for(int i:nums){
        if(digitCount(i)%2==0)
        count++;
     }
     return count;
    }
    public static int digitCount(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}