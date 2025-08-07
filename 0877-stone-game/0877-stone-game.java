class Solution {
    public boolean stoneGame(int[] piles) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.add(i);
        }
        int alice=0;
        int bob=0;
        while(!pq.isEmpty()){
            alice+=pq.poll();
            bob+=pq.poll();
        }
        return alice>bob;
    }
}