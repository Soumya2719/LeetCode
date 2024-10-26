class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer,String> hm=new HashMap<>();

        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
      Arrays.sort(heights);
      int n=heights.length;
      for(int i=0;i<names.length;i++){
        names[n-i-1]=hm.get(heights[i]);
      }
      return names;
    }
}