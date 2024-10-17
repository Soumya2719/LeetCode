class Solution {
    public String reverseWords(String s) {
      String [] st=s.trim().split("\\s+");
        String res="";
        for(int i=0;i<st.length-1;i++){
             res+=reverse(st[i])+" ";
        }
        res+=reverse(st[st.length-1]);

        return res;
    }
    public static String reverse(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
         return res;
    }
   
}