class Solution {
    public boolean isSameAfterReversals(int num) {
       if(num<10){
        return true;
       }
       int temp=num;
       int rev=0;
       while(num>0){
        rev=rev*10+num%10;
        num/=10;
       }
       int rev1=0;
       while(rev>0){
        rev1=rev1*10+rev%10;
        rev/=10;
       }
       return rev1==temp;
    }
}