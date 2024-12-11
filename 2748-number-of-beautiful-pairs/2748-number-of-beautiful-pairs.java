class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(gcd(firstDigit(nums[i]),nums[j]%10)==1)
                count++;

            }
            
        }
        
        
    return count;
    }
    public static int gcd(int a,int b){
        if(a==0)
        return b;
        return gcd(b%a,a);
        
    }
    public int firstDigit(int a){
        while(a>=10){
            a/=10;
        }
        return a;
    }
}