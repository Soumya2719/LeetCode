class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(hm.containsKey(nums[i])==true){
                    int temp=hm.get(nums[i]);
                    hm.put(nums[i],temp+1);
                }
                else{
                    hm.put(nums[i],1);
                }
            }
        }
        int max=0;
        for(int k:hm.values()){
            max=Math.max(max,k);
        }
        int smallest=Integer.MAX_VALUE;
        for(int k:hm.keySet()){
            if(hm.get(k)==max){
                smallest=Math.min(smallest,k);
            }
        }
        if(hm.size()==0){
            return -1;
        }
        return smallest;
    }
}