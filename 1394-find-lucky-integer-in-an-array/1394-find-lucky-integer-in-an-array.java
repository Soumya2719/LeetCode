class Solution {
    public int findLucky(int[] arr) {
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
        int max=0;
        for(int key:hm.keySet()){
            if(hm.get(key)==key){
                 max=Math.max(max,key);
            }
        }
        if(max!=0){
            return max;
        }
        return -1;
    }
}