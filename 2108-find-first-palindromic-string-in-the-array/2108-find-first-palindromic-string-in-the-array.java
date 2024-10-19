class Solution {
    public String firstPalindrome(String[] words) {
        for(String r:words){
            if(isPal(r)){
                return r;
            }
        }
        return "";
    }
    public static boolean isPal(String str){
      String res="";
      for(int i=str.length()-1;i>=0;i--){
        res+=str.charAt(i);
      }
      if(res.equals(str)){
        return true;
      }
      return false;
    }
}