class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       ArrayList<Integer> list=new ArrayList<>();
      String st=""+x;
       for(int i=0;i<words.length;i++){
        if(words[i].contains(st)){
            list.add(i);
        }
       } 
       return list;
    }
}