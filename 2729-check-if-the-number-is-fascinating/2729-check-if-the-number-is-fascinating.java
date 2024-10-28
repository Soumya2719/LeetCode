class Solution {
    public boolean isFascinating(int n) {
        int n1=2*n;
        int n2=3*n;
        String s=""+n+n1+n2;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int temp=hm.get(s.charAt(i));
                hm.put(s.charAt(i),temp+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        if(hm.containsKey('1') &&
        hm.containsKey('2') &&
        hm.containsKey('3') &&
        hm.containsKey('4') &&
        hm.containsKey('5') &&
        hm.containsKey('6') &&
        hm.containsKey('7') &&
        hm.containsKey('8') &&
        hm.containsKey('9') &&
        hm.get('1')==1 && 
        hm.get('2')==1 && 
        hm.get('3')==1 && 
        hm.get('4')==1 && 
        hm.get('5')==1 && 
        hm.get('6')==1 && 
        hm.get('7')==1 && 
        hm.get('8')==1 && 
        hm.get('9')==1  )
        return true;

        return false;
    }
}