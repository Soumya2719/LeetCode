class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<2*n;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int k:hm.keySet()){
            if(hm.get(k)==n)
            return k;
        }
        return -1;
    }
}