class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int n=arr.length/4;
        for(int i:hm.keySet()){
             if(hm.get(i)>n){
                return i;
             }
        }
        return -1;
    }
}