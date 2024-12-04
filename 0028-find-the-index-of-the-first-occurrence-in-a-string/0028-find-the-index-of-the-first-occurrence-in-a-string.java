class Solution {
    public int strStr(String haystack, String needle) {
        if(!(haystack.contains(needle)))
        return -1;
        int n1=needle.length();
        int n2=haystack.length();
        if(n1==n2 && haystack.equals(needle))
        return 0;
        for(int i=0;i<=n2-n1;i++){
            String str=haystack.substring(i,i+n1);
            if(str.equals(needle))
            return i;
        }
     return -1;
        }
}