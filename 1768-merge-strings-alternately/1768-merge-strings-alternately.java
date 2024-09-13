class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
       String str="";
        if(n1==n2){
            for(int i=0;i<n1;i++){
                str+=word1.charAt(i);
                str+=word2.charAt(i);
            }
        }
        else if(n1<n2){
                for(int i=0;i<n1;i++){
                 str+=word1.charAt(i);
                 str+=word2.charAt(i);
                }
              for(int i=n1;i<n2;i++){
                str+=word2.charAt(i);
              }
            }
            else{
                for(int i=0;i<n2;i++){
                 str+=word1.charAt(i);
                 str+=word2.charAt(i);
                }
              for(int i=n2;i<n1;i++){
                str+=word1.charAt(i);
              }
            }
        return str;
    }
}