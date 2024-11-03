class Solution {
    public boolean rotateString(String s, String goal) {
      boolean bool= s.length()==goal.length() && (goal+goal).contains(s);
      return bool;
    }
}