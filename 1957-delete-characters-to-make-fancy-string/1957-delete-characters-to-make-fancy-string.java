class Solution {
    public String makeFancyString(String s) {
      Stack<Character> st=new Stack<>();
      int count=1;
      st.push(s.charAt(0));
      for(int i=1;i<s.length();i++){
        if(st.peek()==s.charAt(i)){
            count++;
          }
          else if(st.peek()!=s.charAt(i)){
            count=1;
          }
          st.push(s.charAt(i));
          if(count==3){
            st.pop();
            count-=1;
          } 
          
      }
      String res="";
    while(!st.isEmpty()){
        res+=st.pop();
    }
    StringBuilder sb = new StringBuilder(res);
    sb.reverse();
    res=sb.toString();
    return res;
    }
}