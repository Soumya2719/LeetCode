class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int res=0;
      for(int key:hm.keySet()){
        if(hm.get(key)==2){
            res^=key;
        }
      }
      return res;
    }
}