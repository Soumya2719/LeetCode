class Solution {
    public boolean isCircularSentence(String sentence) {
       String s[]=sentence.trim().split("\\s+");

       char f=s[0].charAt(0);
       int n=s[s.length-1].length();
       char l=s[s.length-1].charAt(n-1);
         if(f!=l)
         return false;
       for(int i=0;i<s.length-1;i++){
        String s1=s[i];
        String s2=s[i+1];
        int len=s1.length();
        if(s1.charAt(len-1)!=s2.charAt(0))
        return false;
       } 
       return true;
    }
}