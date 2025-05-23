class Solution {
    public int trap(int[] height) {
        int pmax[]=new int[height.length];
        int smax[]=new int[height.length];
        int amount=0;
        pmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            pmax[i]=Math.max(pmax[i-1],height[i]);
        }
        smax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
              smax[i]=Math.max(smax[i+1],height[i]);
        }

        for(int i=1;i<height.length-1;i++){
            int lb=pmax[i-1];
            int rb=smax[i+1];
            int yb=Math.min(lb,rb);
            int contri=yb-height[i];
            if(contri>0){
                amount+=contri;
            }
        }
        return amount;
    }
}