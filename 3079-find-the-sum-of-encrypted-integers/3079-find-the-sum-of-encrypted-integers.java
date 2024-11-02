class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=encrypt(i);
        }
        return sum;
    }
    public static int encrypt(int n){
        int max=0;
        int count=0;
       while(n>0){
        int r=n%10;
        max=Math.max(max,r);
        count++;
        n/=10;
       }
       int arr[]=new int[count];
       for(int i=0;i<count;i++){
        arr[i]=max;
       }
       for(int i=0;i<count;i++){
        arr[i]=max;
       }
       int ans=0;
       for(int i=0;i<count;i++){
        ans=ans*10+arr[i];
       }
       return ans;
    }
}