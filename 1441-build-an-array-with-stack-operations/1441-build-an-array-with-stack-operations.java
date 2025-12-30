class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int input=1;
        for(int i: target){
            while(input<i){
                list.add("Push");
                list.add("Pop");
                input++;
            }
           
            
            list.add("Push");
            input++;
           
        }
        return list;
    }
}