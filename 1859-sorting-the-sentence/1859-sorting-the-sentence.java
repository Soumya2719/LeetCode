class Solution {
    public String sortSentence(String s) {
        String []arr=s.trim().split("\\s+");
        String []arr2=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int a=arr[i].length();
            int index=arr[i].charAt(a-1)-48;
            arr2[index-1]=arr[i].substring(0,a-1);
        }
       String res="";
       for(int i=0;i<arr2.length-1;i++){
          res+=arr2[i]+" ";
       }
       return res+arr2[arr2.length-1];
    }
}