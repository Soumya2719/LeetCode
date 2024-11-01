class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {   
        HashSet <Integer> hs1=new HashSet<>();
        HashSet <Integer> hs2=new HashSet<>();
        for(int k:nums1){
            hs1.add(k);
        }
         for(int k:nums2){
            if(hs1.contains(k))
                 hs2.add(k);
        }
      int n=hs2.size();
      int arr[]=new int[n];
      int i=0;
      for (int k:hs2){
        arr[i]=k;
        i++;
      }
    return arr;
      }
}