class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(strs[i]=="-1"){
                continue;
            }
            ArrayList<String> temp=new ArrayList<>(); 
            temp.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(strs[j]!="-1" && anagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    strs[j]="-1";
                }
            }
            list.add(temp);
        } 
        return list;
    }
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}