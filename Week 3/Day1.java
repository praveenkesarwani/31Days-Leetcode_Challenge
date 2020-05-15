/*
1. Find maximum subarray sum using kadane's algorithm (max) 
2. Find minimum subarray sum using kadane's algorithm (min)
3. Find total sum of the array (sum)
4. Now, if sum == min return max
5. Otherwise, return maximum ( max, sum - min )
*/
/*
 * Time  : O(N) 
 * Space : O(1)
 */
class Solution {
    public int maxSubarraySumCircular(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int max_so_far = A[0];
        int min_so_far = A[0];
        int max_total = A[0];
        int min_total = A[0];
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            int num = A[i];
            max_so_far = Math.max(max_so_far + num, num);
            max_total = Math.max(max_total, max_so_far);

            min_so_far = Math.min(min_so_far + num, num);
            min_total = Math.min(min_total, min_so_far);

            sum += num;
        }
        if (sum == min_so_far) // There is a special case, if sum == min,then maximum sum is max.
            return max_total;
        return Math.max(sum - min_total, max_total);
    }
}
