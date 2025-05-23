class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] pf = new int[n];
        pf[0] = nums[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }

        

        // Check index 0 (no elements to the left)
        if (pf[n - 1] - pf[0] == 0) {
            return 0;
        }

        // Check index n-1 (no elements to the right)
        

        // Check for all middle indices
        for (int i = 1; i < n - 1; i++) {
            int lsum = pf[i - 1];
            int rsum = pf[n - 1] - pf[i];
            if (lsum == rsum) {
                return i;
            }
        }
         if (pf[n - 2] == 0) {
           return nums.length-1;
        }
        return -1;
    }
}
