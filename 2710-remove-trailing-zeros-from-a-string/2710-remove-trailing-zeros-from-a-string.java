class Solution {
    public String removeTrailingZeros(String num) {
       int n=num.length();
       int count=0;
       ArrayList<Character> list=new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(num.charAt(i));
       }
       for(int i=n-1;i>=0;i--){
        if(list.get(i)=='0'){
            list.remove(i);
        }
        else{
            break;
        }
       }
      String s="";
      int m=list.size();
       for(int i=0;i<m;i++){
        s+=list.get(i);
       }
       return s;
    }
}