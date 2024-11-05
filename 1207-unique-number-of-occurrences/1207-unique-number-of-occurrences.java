class Solution {
    public boolean uniqueOccurrences(int[] arr) {
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
        int n=hm.size();
       int arr1[]=new int[n];
       int x=0;
       for(int i:hm.keySet()){
         arr1[x]=hm.get(i);
         x++;
       }
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr1[i]==arr1[j])
            return false;
        }
       }
       return true;
    }
}