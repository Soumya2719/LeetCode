class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(isAlpha(ch[i]) && isAlpha(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!isAlpha(ch[i])){
                i++;
            }
            else if(!isAlpha(ch[j])){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isAlpha(char ch){
        if(ch>=65 && ch <=90){
            return true;
        }
        else if(ch>=97 && ch<=122){
            return true;
        }
        return false;
    }
}