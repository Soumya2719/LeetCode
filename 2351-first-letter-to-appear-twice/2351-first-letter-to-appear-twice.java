class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> list=new ArrayList<>();
        list.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                list.add(s.charAt(i));
            }
        }
        return s.charAt(s.length()-1);
    }
}