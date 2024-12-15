class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp=strs[0];
      
           for(int i=1;i<strs.length;i++){
            int min=Math.min(strs[i].length(),temp.length());
            String res="";
              for(int j=0;j<min;j++){
                if(temp.charAt(j)==strs[i].charAt(j)){
                    res+=strs[i].charAt(j);
                }
                else{
                    break;
                }
              }
              temp=res;
           }
           return temp;
    }
}