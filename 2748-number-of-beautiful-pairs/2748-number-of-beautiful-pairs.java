class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                String str1=nums[i]+"";
                String str2=nums[j]+"";
                int a=Integer.parseInt(str1.charAt(0)+"");
                int b=Integer.parseInt(str2.charAt(str2.length()-1)+"");
                if(gcd(a,b)==1)
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
}