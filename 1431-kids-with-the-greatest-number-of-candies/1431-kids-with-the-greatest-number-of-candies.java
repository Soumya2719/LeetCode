class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int n=candies.length;
        int max=candies[0];
        candies[0]+=extraCandies;
        for(int i=1;i<n;i++){
            if(max<candies[i])
            max=candies[i];

            candies[i]+=extraCandies;
        }
        for(int i=0;i<n;i++){
            if(candies[i]>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}