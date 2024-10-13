class Solution {
    public long countVowels(String word) {
        int n=word.length();
        long count=0;
        for(int i=0;i<n;i++){
            if(isVowel(word.charAt(i))){
                count+=(long)(n-i)*(long)(i+1);
            }
            
        }
        return count;
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='O' || c=='U' ){
            return true;
        }
        return false;

    }
}