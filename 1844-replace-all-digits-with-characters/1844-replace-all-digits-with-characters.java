class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
       String ans="";
        for(int i=0;i<n;i++){
          if(i%2==0){
            ans+=s.charAt(i);
          }
          else{
            ans+=shift(s.charAt(i-1),s.charAt(i)-'0');
          }
    }
    return ans;
    }
    public  char shift(char c,int d){
        return (char)((int)c+d);
    }
}