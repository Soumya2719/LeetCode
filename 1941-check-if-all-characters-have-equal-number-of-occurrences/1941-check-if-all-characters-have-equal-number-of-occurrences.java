class Solution {
    public boolean areOccurrencesEqual(String s) {
     HashMap<Character,Integer> hm=new HashMap<>();
     for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i))==true){
            int temp=hm.get(s.charAt(i));
            hm.put(s.charAt(i),temp+1);
        }
        else{
            hm.put(s.charAt(i),1);
        }
     }
    for(int i=0;i<s.length()-1;i++){
        if(hm.containsKey(s.charAt(i))==true && hm.containsKey(s.charAt(i+1))==true){
           int temp1=hm.get(s.charAt(i));
           int temp2=hm.get(s.charAt(i+1));
           if(temp1!=temp2){
            return false;
           }
        }
    }
    return true;
    }
}