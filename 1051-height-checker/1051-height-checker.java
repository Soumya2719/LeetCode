class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=heights.clone();
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(heights[i]!=arr[i]){
                count++;
            }
        }
        return count;
    }
}