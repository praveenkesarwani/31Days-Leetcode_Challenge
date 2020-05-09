// binary Search approach
// Time Complexity: O(log(N))
class Solution {
    public boolean binary_search(int num){
        if(num < 1){
            return false;
        }
        else if(num == 1){
            return true;
        }
        long left = 1;
        long right = num;
        while(left <= right){
            long mid = left + (right - left ) / 2;
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid < num){
                left = mid + 1;
            }
            else if(mid * mid > num){
                right = mid - 1;
            }
        }
        return false;
    }
    public boolean isPerfectSquare(int num) {
        return binary_search(num);
    }
}