class Solution {
    public String capitalizeTitle(String title) {
      String s=title.toLowerCase();
       String arr[]=s.trim().split("\\s+");

       for(int i=0;i<arr.length;i++){
        if(arr[i].length()>2)
          arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length());
       
       }
       String res="";
       for(int i=0;i<arr.length-1;i++){
          res+=arr[i]+" ";
       }
       res+=arr[arr.length-1];
       return res;
    }
}