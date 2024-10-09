class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(even(nums[i])){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(!even(nums[i])){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=arr.get(i);
        }
        return nums;
    }
    public static boolean even(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}