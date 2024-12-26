class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
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
       for(int i:hm.keySet()){
        if(hm.get(i)==2)
        list.add(i);
       }
       return list;
    }
}