class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int i:hm.values()){
            if(i%2!=0)
            return false;
        }
        return true;
    }
}