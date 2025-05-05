class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         ArrayList<Character> list1=new ArrayList<>();
         ArrayList<Character> list2=new ArrayList<>();
         for(int i=0;i<ransomNote.length();i++){
            list1.add(ransomNote.charAt(i));
         }
         for(int i=0;i<magazine.length();i++){
            list2.add(magazine.charAt(i));
         }

         for(int i=0;i<ransomNote.length();i++){
              if(list2.size()>0){
                if(!list2.contains(ransomNote.charAt(i))){
                return false;
              }
              else{
                list2.remove(Character.valueOf(ransomNote.charAt(i)));
              }
              }
              else{
                return false;
              }
         }
         return true;
    }
}