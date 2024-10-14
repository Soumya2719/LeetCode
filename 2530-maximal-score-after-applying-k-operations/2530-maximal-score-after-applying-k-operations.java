class Solution {
    public long maxKelements(int[] nums, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            pq.add(i);
        }
        long sum=0;
        while(k>0){
            int a=pq.poll();
            sum+=a;
            pq.add((int)Math.ceil(a/3.0));
            k--;
        }
        return sum;
    }
}