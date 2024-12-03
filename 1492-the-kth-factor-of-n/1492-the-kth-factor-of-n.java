class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=1;
        for(;i<=n/2;i++){
            if(n%i==0)
            list.add(i);
        }
        list.add(n);
        int size=list.size();
        if(k>size)
        return -1;
        return list.get(k-1);
    }
}