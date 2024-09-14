class Solution {
    public String removeStars(String s) {
      Stack <Character> st=new Stack<>();
      int n=s.length();
      for(int i=0;i<n;i++){
        if(s.charAt(i)!='*'){
            st.push(s.charAt(i));
        }
        else{
            st.pop();
        }
      }  
      char []ch=new char[st.size()];
      for(int i=ch.length-1;i>=0;i--){
        ch[i]=st.pop();
      }
      return String.valueOf(ch);
    }
}