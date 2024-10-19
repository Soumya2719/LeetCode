class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.trim().split("\\s+");
        String res="";
        for(int i=0;i<k-1;i++){
            res+=str[i]+" ";
        }
        res+=str[k-1];
        return res;
    }
}