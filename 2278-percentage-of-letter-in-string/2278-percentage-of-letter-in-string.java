class Solution {
    public int percentageLetter(String s, char letter) {
       int count=0;
       int n=s.length();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==letter)
        count+=1;
       } 
   return (int)Math.floor((double)(count*100)/n);
    }
}