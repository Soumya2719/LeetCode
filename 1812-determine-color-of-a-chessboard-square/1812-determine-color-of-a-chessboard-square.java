class Solution {
    public boolean squareIsWhite(String coordinates) {
            if((coordinates.charAt(1))%2!=0){
            if(coordinates.charAt(0)=='a' || coordinates.charAt(0)=='c' || coordinates.charAt(0)=='e' ||
            coordinates.charAt(0)=='g'){
            return false;
            }
            }
             if((coordinates.charAt(1))%2==0){
            if(coordinates.charAt(0)=='b' || coordinates.charAt(0)=='d' || coordinates.charAt(0)=='f' ||
            coordinates.charAt(0)=='h'){
            return false;
            }
            }
        return true;
    }
}