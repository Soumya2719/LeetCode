class Solution {
    public boolean reorderedPowerOf2(int n) {
        String str=""+n;
        for(int i=0;i<31;i++){
            int temp=1<<i;
            String res=""+temp;
            if(ana(res,str)){
                return true;
            }
        }
        return false;
    }
    public static boolean ana(String a,String b){
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        a=new String(ch1);
        b=new String(ch2);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}