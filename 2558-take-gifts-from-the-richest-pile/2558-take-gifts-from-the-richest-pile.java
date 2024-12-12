class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i=1;i<=k;i++){
            int temp=findMax(gifts);
            gifts[temp]=(int)Math.sqrt(gifts[temp]);
        }
       long sum=0;
        for(int i:gifts){
            sum+=i;
        }
        return sum;
    }
    public int findMax(int arr[]){
        int index=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}