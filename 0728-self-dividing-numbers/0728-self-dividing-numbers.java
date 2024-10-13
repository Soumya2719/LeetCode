class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDiv(i)){
                 list.add(i);
            }
        }
        return list;
    }
    public static boolean selfDiv(int n){
        int temp=n;
        if(n<10){
            return true;
        }
        while(n>0){
            int r=n%10;
            if(r==0){
                return false;
            }
            if(temp%r!=0){
                 return false;
            }
            n/=10;
        }
        return true;
    }
}