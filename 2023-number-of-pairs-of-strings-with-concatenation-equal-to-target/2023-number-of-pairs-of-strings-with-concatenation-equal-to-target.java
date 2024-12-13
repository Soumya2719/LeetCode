class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
             String temp=concat(nums[i],nums[j]);
             if(i!=j){
                if(temp.equals(target))
                count++;
             }
            }
        }
        return count;
    }
    public static String concat(String str1,String str2){
        return str1+str2+"";
    }
}