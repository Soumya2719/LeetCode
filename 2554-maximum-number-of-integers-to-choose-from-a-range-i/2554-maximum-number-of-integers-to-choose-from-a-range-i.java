class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
      HashSet<Integer> hs=new HashSet<>();
      for(int i=0;i<banned.length;i++){
        hs.add(banned[i]);
      }
      int count=0;
      int sum=0;
       for(int i=1;i<=n;i++){
         if (hs.contains(i)) continue;
            
            if (sum + i > maxSum) break;
            
            sum += i;
            count++;
       }
       return count;
    }
       
}