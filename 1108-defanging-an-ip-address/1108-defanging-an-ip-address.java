class Solution {
    public String defangIPaddr(String address) {
            Queue <Character> q=new LinkedList<>();
            q.add(address.charAt(0));
            for(int i=1;i<address.length();i++){
                if(address.charAt(i)=='.'){
                    q.add('[');
                    q.add(address.charAt(i));
                    q.add(']');
                }
                else{
                    q.add(address.charAt(i));
                }
            }
            String res="";
            while(q.size()!=0){
                res=res+q.poll();
            }
            return res;
    }
}