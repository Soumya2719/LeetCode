class Solution {
    public String restoreString(String s, int[] indices) {
        char []ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            int temp=indices[i];
            ch[temp]=s.charAt(i);
        }
        return String.valueOf(ch);
    }
}