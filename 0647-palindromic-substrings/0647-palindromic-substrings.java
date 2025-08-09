class Solution {
    public int countSubstrings(String s) {
       int count=s.length();
       for(int i=0;i<s.length();i++){
           for(int j=i+2;j<=s.length();j++){
                String str=s.substring(i,j);
                if(isPal(str)){
                    count++;
                }
           }
           
       } 
       return count;
    }
       public static  boolean isPal(String str){
        StringBuilder sb=new StringBuilder(str);
          String rev=sb.reverse().toString();

          if(str.equals(rev)){
            return true;
          }
          return false;
       }
    
}