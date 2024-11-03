class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            hs.add(reverse(nums[i]));
        }
        return hs.size();
    }
    public static int reverse(int n){
        int rev=0;
        if(n<10){
            return n;
        }
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
}