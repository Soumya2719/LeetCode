class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                a+=b;
                st.push(a);
            }
            else if(s.equals("-")){
                int a=st.pop();
                int b=st.pop();
                a=b-a;
                st.push(a);
            }
            else if(s.equals("*")){
                int a=st.pop();
                int b=st.pop();
                a*=b;
                st.push(a);
            }
            else if(s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                a=b/a;
                st.push(a);
            }
            else{
                int temp=Integer.parseInt(s);
                st.push(temp);
            }
        }
        return st.pop();
    }
}