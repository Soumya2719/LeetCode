class Solution {
    public int trap(int[] height) {
        int amount=0;
        int pfmax[]=new int[height.length];
        int sfmax[]=new int[height.length];
        pfmax=prefixMax(height);
        sfmax=suffixMax(height);
        for(int i=1;i<height.length-1;i++){
            int lb=pfmax[i-1];
            int rb=sfmax[i+1];
            int yb=Math.min(lb,rb);
            int contri=yb-height[i];
            if(contri>0)
            amount+=contri;
        }
        return amount;
    }
    public static int[] prefixMax(int arr[]){
        int n=arr.length;
        int pfmax[]=new int[n];
        pfmax[0]=arr[0];
        for(int i=1;i<n;i++){
            pfmax[i]=Math.max(pfmax[i-1],arr[i]);
        }
        return pfmax;
    }
    public static int[] suffixMax(int arr[]){
        int n=arr.length;
        int sfmax[]=new int[n];
        sfmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sfmax[i]=Math.max(sfmax[i+1],arr[i]);
        }
        return sfmax;
    }
}