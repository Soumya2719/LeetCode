class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        int max=0;
        char ch[]=num.toCharArray();
        for(int i=0;i<ch.length-2;i++){
            char a=ch[i];
            char b=ch[i+1];
            char c=ch[i+2];
            String temp=""+a+b+c;
            int n=Integer.parseInt(temp);
            if(max<=n && (a==b && b==c) ){
                max=n;
                res=temp;
            }

        }
        return res;
    }
}