class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> list=new ArrayList<>();
       for(int i:nums1){
          list.add(i);
       }

       ArrayList<Integer> temp=new ArrayList<>();
       for(int i=0;i<nums2.length;i++){
           if(list.contains(nums2[i])){
            temp.add(nums2[i]);
            list.remove(Integer.valueOf(nums2[i]));
           }
       }
       int arr[]=new int[temp.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=temp.get(i);
       }
       return arr;
    }
}