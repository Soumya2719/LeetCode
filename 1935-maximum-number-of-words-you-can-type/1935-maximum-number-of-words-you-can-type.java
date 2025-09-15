class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []str=text.split(" ");
        char c []=brokenLetters.toCharArray();
         int count=str.length;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<c.length;j++){
                String temp=c[j]+"";
                if(str[i].contains(temp)){
                  count--;
                  break;
                }
            }
        }
        return count;
    }
}