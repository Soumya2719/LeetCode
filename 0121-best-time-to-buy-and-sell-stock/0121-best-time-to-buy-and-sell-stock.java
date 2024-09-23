class Solution {
    public int maxProfit(int[] prices) {
      int bprice=prices[0];
      int profit=0;
      for(int i=0;i<prices.length;i++){
        if(bprice>prices[i]){
            bprice=prices[i];
        }
         profit=Math.max(profit,prices[i]-bprice);
      }
     return profit;
    }
}