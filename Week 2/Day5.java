// Single Element in a Sorted Array
// used bitwise operator 

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}