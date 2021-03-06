public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int l = -1, r = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                if(l == -1) {
                    l = i;
                    r = i;
                }
                else {
                    r++;
                }
            }
            else {
                if(l != -1 && r != -1) {
                    max = Math.max(max, r - l + 1);
                    l = -1;
                    r = -1;
                }
            }
        }
        if(l != -1 && r != -1) max = Math.max(max, r - l + 1);


        return max;

    }
}
