class Solution {
    public void moveZeroes(int[] nums) {
      ArrayList<Integer> nz=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nz.add(nums[i]);
        }
      }
      int arr[]=new int[nums.length];
      for(int i=0;i<nz.size();i++){
             arr[i]=nz.get(i);
      }
      for(int i=nz.size();i<nums.length;i++){
        arr[i]=0;
      }
      for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
      }
    }
}