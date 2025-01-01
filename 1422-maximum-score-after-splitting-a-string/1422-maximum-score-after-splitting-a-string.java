class Solution {
    public int maxScore(String s) {
        int max=0;
        for(int i=1;i<s.length();i++){
            String ls=s.substring(0,i);
            String rs=s.substring(i,s.length());
            max=Math.max(max,(count(ls,'0')+count(rs,'1')));
        }
        return max;
    }
    public static int count(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
            count++;
        }
        return count;
    }
}