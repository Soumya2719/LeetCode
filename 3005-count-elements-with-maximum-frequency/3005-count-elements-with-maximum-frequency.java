class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int max=0;
        for(int k:hm.values()){
          max=Math.max(max,k);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==max){
                count++;
            }
        }
        return count;
    }
}