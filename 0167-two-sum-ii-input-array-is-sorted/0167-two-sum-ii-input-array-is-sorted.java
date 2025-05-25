class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st=0;
        int end=numbers.length-1;
     int arr[]={-1,-1};
        while(st<end){
            int temp=numbers[end]+numbers[st];

            if(temp==target){
                arr[0]=st+1;
                arr[1]=end+1;
                return arr;
            }
            else if(target>temp){
                st++;
            }
            else{
                end--;
            }
        }
        return arr;
    }
}