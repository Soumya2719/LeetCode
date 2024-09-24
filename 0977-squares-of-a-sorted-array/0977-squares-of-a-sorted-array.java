class Solution {
    public int[] sortedSquares(int[] nums) {
        int sq[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        sq[i]=Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(sq);
        return sq;
    }
}