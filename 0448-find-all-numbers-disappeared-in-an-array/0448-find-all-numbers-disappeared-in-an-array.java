class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
        hs.add(i);

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
          list.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(hs.contains(list.get(i))){
                continue;
            }
            else{
                ans.add(list.get(i));
            }
        }
        return ans;
    }
}