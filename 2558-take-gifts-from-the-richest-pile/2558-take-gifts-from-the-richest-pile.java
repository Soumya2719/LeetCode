class Solution {
    public long pickGifts(int[] gifts, int k) {
      ArrayList<Integer> list=new ArrayList<>();
      for(int i:gifts)
      list.add(i);
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      for(int i:list){
        pq.add(i);
      }
      for(int i=0;i<k;i++){
         int max=pq.poll();
         pq.add((int)(Math.sqrt(max)));
      }
      long sum=0;
      while(pq.size()>0){
           sum+=pq.poll();
      }
      return sum;
    }
}