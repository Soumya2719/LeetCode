class Solution {
    public String[] findRelativeRanks(int[] score) {
      int arr[]=score.clone();
      Arrays.sort(arr);
      HashMap<Integer,String> hm=new HashMap<>();
      for(int i=0;i<arr.length;i++){
        int rank=arr.length-i;
        if(rank==1){
            hm.put(arr[i],"Gold Medal");
        }
        else if(rank==2){
            hm.put(arr[i],"Silver Medal");
        }
        else if(rank==3){
            hm.put(arr[i],"Bronze Medal");
        }
        else{
            hm.put(arr[i],""+rank);
        }
      }
      String res[]=new String[arr.length];
      for(int i=0;i<arr.length;i++){
        res[i]=hm.get(score[i]);
      }
      return res;
    }
}