class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            int temp=arr2[i];
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==temp){
                    ans[k]=temp;
                    k++;
                    arr1[j]=-1;
                }
            }
        }
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=-1){
            pq.add(arr1[i]);
        }
       }
       while(!pq.isEmpty()){
          ans[k]=pq.poll();
          k++;
       }
        return ans;
    }
}