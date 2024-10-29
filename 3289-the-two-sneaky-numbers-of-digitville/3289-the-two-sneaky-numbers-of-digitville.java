class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
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
        int i=0;
        for(int k:hm.keySet()){
            if(hm.get(k)==2){
                arr[i]=k;
                i++;
            }
        }
        return arr;
    }
}