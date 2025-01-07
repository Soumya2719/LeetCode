class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        String str1="";
        String str2="";
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                   str1=words[i];
                   str2=words[j];
                   if(str2.contains(str1)){
                    list.add(str1);
                    continue;
                   }
                }
            }
        }
        return list;
    }
}