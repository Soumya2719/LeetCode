class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       Queue<Integer> list1=new LinkedList<>();
       Queue<Integer> list2=new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
             list1.add(nums[i]);
            else
              list2.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=list1.peek();
                list1.poll();
            }
            else{
                nums[i]=list2.peek();
                list2.poll();
            }
        }
        return nums;
    }
}