class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
       if(n1!=n2){
        return false;
       }
       else if(s1.equals(s2)){
        return true;
       }
       else{
        for(int i=0;i<s2.length()-1;i++){
            for(int j=i+1;j<s2.length();j++){
              String res=swap(s2,i,j);
              if(s1.equals(res)){
                return true;
              }
            }
           
        }
         return false;
       }
     
    }
    public static String swap(String str,int i,int j){
    char ch[]=new char[str.length()];
    for(int k=0;k<str.length();k++){
    ch[k]=str.charAt(k);
    }
 char temp=ch[i];
 ch[i]=ch[j];
 ch[j]=temp;
 String res="";
 for(char c:ch){
    res+=c;
 }
 return res;
    }
}