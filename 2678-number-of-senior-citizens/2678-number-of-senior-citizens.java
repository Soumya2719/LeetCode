class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(isSenior(details[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean isSenior(String s){
          int n=s.length();
          int ch=s.charAt(n-4);
          int ch1=s.charAt(n-3);
          if(ch==54 && ch1==48){
            return false;
          }
          if(ch<54){
            return false;
          }
          return true;
    }
}