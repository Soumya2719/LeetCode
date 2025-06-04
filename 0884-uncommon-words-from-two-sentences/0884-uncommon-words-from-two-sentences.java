class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      String str1[]=s1.trim().split("\\s+");
      String str2[]=s2.trim().split("\\s+");
      ArrayList<String> list=new ArrayList<>();    
      int length=Math.min(str1.length,str2.length);
      for(int i=0;i<length;i++){
        if(!(str1[i].equals(str2[i])))
        list.add(str2[i]);
      }
      String res[]=new String[list.size()];
      int i=0;
      for(String s:list){
        res[i]=s;
        i++;
      }
      return res;
    }
}