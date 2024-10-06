class Solution {
    public boolean isPalindrome(String s) {
    String s2=s.toLowerCase();
    String s3=s2.replaceAll("\\W+","");
    String s4=s3.replaceAll("_","");
    int n=s4.length();
    for(int i=0;i<n/2;i++){
        if(s4.charAt(i)!=s4.charAt(n-i-1))
             return false;

    }
    return true;

    }
}