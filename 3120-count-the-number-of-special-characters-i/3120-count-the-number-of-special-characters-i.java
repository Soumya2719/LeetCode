class Solution {
    public int numberOfSpecialChars(String word) {
       HashSet<Character> hs=new HashSet<>();
       for(int i=0;i<word.length();i++)
       hs.add(word.charAt(i));
       int count=0;
        for(char c:hs){
        if(hs.contains((char)(c+32)))
        count++;
        }
        return count;
    }
}