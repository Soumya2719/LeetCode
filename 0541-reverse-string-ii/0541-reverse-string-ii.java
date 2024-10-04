class Solution {
    public String reverseStr(String s, int k) {
       char []ch=s.toCharArray();
       int n=ch.length;
       for(int i = 0; i<n; i+=2*k){
        int j = Math.min(i+k-1, n-1);
        reverse(i,j,ch);
       }
     return new String(ch);
     
    }
    public static void reverse(int st,int end,char []ch){
        while(st<end){
            char temp=ch[st];
            ch[st]=ch[end];
            ch[end]=temp;
            st++;
            end--;
        }
    }
}