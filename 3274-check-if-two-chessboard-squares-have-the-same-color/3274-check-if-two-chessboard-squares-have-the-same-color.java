class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if(squareIsWhite(coordinate1)==squareIsWhite(coordinate2))
        return true;

        return false;
    }
     public static boolean squareIsWhite(String coordinates) {
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