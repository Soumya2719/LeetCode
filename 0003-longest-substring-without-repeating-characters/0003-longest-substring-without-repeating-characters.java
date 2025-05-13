import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int maxSize = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

           
            while (list.contains(c)) {
                list.remove(0); 
            }

            list.add(c);  
            maxSize = Math.max(maxSize, list.size());  
        }

        return maxSize;
    }
}
