class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String []str=sentence.trim().split("\\s+");
        String prev=dictionary.get(0);;
        for(int i=0;i<dictionary.size();i++){
            for(int j=0;j<str.length;j++){
                if(str[j].startsWith(dictionary.get(i))){
                    if(str[j].length()>=dictionary.get(i).length()){
                        str[j]=dictionary.get(i);
                    }
                }
            }
        }
       String res="";
       for(int i=0;i<str.length-1;i++){
        res+=str[i]+" ";
       }
       res+=str[str.length-1];
        return res;
    }
   
}