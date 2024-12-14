class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replace(","," ");
        paragraph=paragraph.replace("."," ");
        paragraph=paragraph.toLowerCase();
        String arr[]=paragraph.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<banned.length;i++){
            hm.remove(banned[i]);
        }
        String ans="";
        int max=0;
        for(int i:hm.values()){
          max=Math.max(i,max);
        }
        for(String i:hm.keySet()){
            if(hm.get(i)==max)
            ans=i;
        }
        return ans;
    }
}