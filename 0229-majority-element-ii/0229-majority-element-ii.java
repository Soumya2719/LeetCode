class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])==true){
                int temp=hm.get(nums[i]);
                hm.put(nums[i],temp+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
       int n=nums.length;
       n/=3;
       for(int i:hm.keySet()){
        int v=hm.get(i);
        if(v>n){
            list.add(i);
        }
       }
        return list;
    }
}