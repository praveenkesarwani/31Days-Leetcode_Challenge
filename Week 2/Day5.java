/*
Problem: Single Element in a Sorted Array
The unique number must be at even position.
nums[mid] == nums[mid ^ 1], for odd position compares with the previous number and
for even position compares with the next number.
Time Complexicity: O(log n)
Space Complexicity: O(1)
*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == nums[mid ^ 1])
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}
