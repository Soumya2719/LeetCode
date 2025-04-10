class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> small=new ArrayList<>();
         ArrayList<Integer> equal=new ArrayList<>();
        ArrayList<Integer> large=new ArrayList<>();
        for(int i:nums){
            if(i>pivot){
                large.add(i);
            }
            else if(i<pivot){
                small.add(i);
            }
            else{
                equal.add(i);
            }
        }
        int sizeSmall=small.size();
        int sizeLarge=large.size();
        int sizeEqual=large.size();

        for(int i:equal){
            small.add(i);
        }
        for(int i:large){
            small.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=small.get(i);
        }
        return nums;
    }
}