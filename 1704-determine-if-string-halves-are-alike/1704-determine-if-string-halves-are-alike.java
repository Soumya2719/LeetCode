class Solution {
    public boolean halvesAreAlike(String s) {
       int n=s.length();
       int mid=n/2;
       int vcount1=0;
       int vcount2=0;
       if(n==2){
          if(isVowel(s.charAt(0)) && isVowel(s.charAt(1))){
            return true;
          }
       }
       for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))){
                vcount1++;
            }
       } 
        for(int i=n/2;i<n;i++){
           if(isVowel(s.charAt(i))){
            vcount2++;
           }
       } 
       if(vcount1==vcount2){
        return true;
       }
       return false;
    }
    public static boolean isVowel(char s){
        if(s=='a' || s=='e' || s=='i' || s=='o' ||
            s=='u' || s=='A' || s=='E' || s=='I' || s=='O'||
            s=='U')
            return true;
        return false;
    }
    
}