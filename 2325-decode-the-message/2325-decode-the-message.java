class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        char ch='a';
        key=key.replaceAll(" ","");
        for(int i=0;i<key.length();i++){
            
            if(!hm.containsKey(key.charAt(i))){
                hm.put(key.charAt(i),ch++);  
            }

        }
        String ans="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)!=' '){
               ans+=hm.get(message.charAt(i)); 
            }
            else{
                ans+=' ';
            }
        }
        return ans;
    }
}