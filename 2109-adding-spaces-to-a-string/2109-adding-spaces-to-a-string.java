class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sp = new StringBuilder();
        sp.append(s);
        for(int i=0; i<spaces.length;i++){
            spaces[i]=spaces[i]+i;
        }
        for (int c : spaces) {
            sp.insert(c," ");
        }
        return sp.toString();
    }
}