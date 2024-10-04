class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=0;i<=Math.sqrt(num);i++){
            if(Math.pow(i,2)==num){
                return true;
            }
        }
        return false;
    }
}