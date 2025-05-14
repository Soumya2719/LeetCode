class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n<3)
        return false;
        int vc=0;
        int cc=0;
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                vc++;
            }
           else if((s.charAt(i)>='a' && s.charAt(i)<'z') || (s.charAt(i)>='A' && s.charAt(i)<'Z')){
               cc++;
           }
           else if((s.charAt(i)>=48 && s.charAt(i)<=57)){
             continue;
           }
           else{
            return false;
           }
        }
        
        for(int i=0;i<n;i++){
            if((s.charAt(i)>=48 && s.charAt(i)<=57) || (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
              if(vc>=1 && cc>=1){
                return true;
              }
            }
        }
        return false;
    }
    public static boolean isVowel(char s){
         if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A'
        || s=='E' || s=='I' || s=='O' || s=='U'){
                return true;
            }
            return false;
    }
}