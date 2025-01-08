class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                String str1=words[i];
                String str2=words[j];
                if(isPrefixAndSufix(str1,str2))
                count++;
            }
        }
        return count;
    }
    public static boolean isPrefixAndSufix(String str1,String str2){
        if(str2.length()>=str1.length()){
            int n1=str1.length();
            String temp1=str2.substring(0,n1);
            String temp2=str2.substring(str2.length()-n1,str2.length());
            if(str1.equals(temp1) && str1.equals(temp2))
            return true;
        }
        return false;
    }
}