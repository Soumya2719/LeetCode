class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1="";
        for(int i=0;i<word1.length;i++){
              res1+=word1[i];
        }
        String res2="";
        for(int i=0;i<word2.length;i++){
              res2+=word2[i];
        }
        return res1.equals(res2);
    }
}