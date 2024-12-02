class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            if(isprefix(temp,searchWord))
            return i+1;
        }
        return  -1;
    }
    public static boolean isprefix(String s,String pre){
       return s.startsWith(pre);
    }
}