class Solution {
    public String largestOddNumber(String num) {
      int length=num.length();
      for(int i=length-1;i>=0;i--){
        if(num.charAt(i)%2==1){
            return num.substring(0,i+1);
        }
      }
      return "";
    }
}