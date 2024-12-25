class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
        
            if(!(pallindrome(baseCovert(n,i))))
            return false;
        }
        return true;
    }
    public static String baseCovert(int n,int b){
       return Integer.toString(n,b);
    }
    public static boolean pallindrome(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res.equals(s);
    }
}