class Solution {
    public int dominantIndex(int[] nums) {
        int index=findMax(nums);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        pq.add(nums[i]);

        pq.poll();
        int sec=pq.peek();
        if(nums[index]>=sec*2)
        return index;

        return -1;

        
    }
    public static int findMax(int arr[]){
        int index=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                index=i;
                max=arr[i];
            }
        }
        return index;
    }
    
}