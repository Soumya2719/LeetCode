class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int empty=numBottles;
        while(numBottles>=numExchange){
           empty+=(int)(numBottles/numExchange);
           numBottles=(int)(numBottles/numExchange)+(int)(numBottles%numExchange);

        }
        return empty;
    }
}