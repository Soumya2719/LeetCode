class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {   
        HashMap <Integer,Integer> hs1=new HashMap<>();
        HashMap <Integer,Integer> hs2=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(hs1.containsKey(nums1[i])){
                int temp=hs1.get(nums1[i]);
                hs1.put(nums1[i],temp+1);
            }
            else{
                hs1.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(hs2.containsKey(nums2[i])){
                int temp=hs2.get(nums2[i]);
                hs2.put(nums2[i],temp+1);
            }
            else{
                hs2.put(nums2[i],1);
            }
        }
        for(int k:hs1.keySet()){
            if(hs1.containsKey(k) && hs2.containsKey(k)){
               list.add(k);
        }
        }
        int size=list.size();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=list.get(i);
        }
        return arr;
      }
}