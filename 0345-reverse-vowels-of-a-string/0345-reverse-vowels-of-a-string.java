class Solution {
    public String reverseVowels(String s) {
     char []arr=s.toCharArray();
     int st=0,e=arr.length-1;
     while(st<e){
        if(isVowel(arr[st]) && isVowel(arr[e])){
            char temp=arr[st];
            arr[st]=arr[e];
            arr[e]=temp;
            st++;
            e--;
        }else if(!isVowel(arr[st])){
            st++;
        }else{
            e--;
        }
     }   
     return new String(arr);
    }
    public boolean isVowel(char y){
        if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='O' || y=='E' || y=='I' || y=='U'){
            return true;
        }
        return false;
    }
}