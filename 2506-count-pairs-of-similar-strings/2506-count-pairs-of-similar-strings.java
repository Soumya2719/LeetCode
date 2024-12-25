class Solution {
    public int similarPairs(String[] words) {
        int count=0;

        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                  if(similar(words[i],words[j]))
                  count++;
            }
        }
        return count;
    }
    public static boolean similar(String str1,String str2){
        HashSet<Character> hs1=new HashSet<>();
        HashSet<Character> hs2=new HashSet<>();
        for(int i=0;i<str1.length();i++){
            hs1.add(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++){
            hs2.add(str2.charAt(i));
        }
       if(hs1.size()!=hs2.size())
       return false;
       else{
         for(char c:hs1){
            if(!hs2.contains(c))
            return false;
         }
       }
       return true;
    }
}