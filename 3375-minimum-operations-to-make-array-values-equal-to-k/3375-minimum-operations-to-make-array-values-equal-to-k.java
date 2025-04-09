class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(i>k)
               hs.add(i);
            else if(i<k){
                return -1;
            }
        }
        return hs.size();
    }
}