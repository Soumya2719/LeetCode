class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
       int length=pref.length();
       for(String s:words){
        if(s.length()>=length){
            if(s.substring(0,length).equals(pref))
            count++;
        }
       }
       return count;
    }
}