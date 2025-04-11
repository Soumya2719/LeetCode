class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSimilar(i))
              count++;
        }
        return count;
    }
    public static boolean isSimilar(int n){
        String str=""+n;
        int length=str.length();
        if(length%2!=0){
             return false;
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<length/2;i++){
            sum1+=Integer.parseInt(str.charAt(i)+"");
        }
         for(int i=length/2;i<length;i++){
            sum2+=Integer.parseInt(str.charAt(i)+"");
        }
        if(sum1==sum2)
          return true;
        else 
          return false;
    }
}