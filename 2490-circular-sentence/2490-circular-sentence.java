class Solution {
    public boolean isCircularSentence(String sentence) {
       String s[]=sentence.trim().split("\\s+");
       char f=sentence.charAt(0);
       char l=sentence.charAt(sentence.length()-1);
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