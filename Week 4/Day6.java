//Counting Bits
class Solution {
    // O(n) solution
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        for(int i = 1;i <= num;i++){
            res[i] = res[i & (i - 1)] + 1;
        }
        return res;
    }
}
    
//O(n*sizeof(integer)) Approach

//     public int[] countBits(int num) {
//         int[] ans = new int[num + 1];
//         for(int i = 0;i <= num;i++){
//             ans[i] = countSetBits(i);
//         }
//         return ans;
//     }
    
//     private int countSetBits(int n) 
//     { 
//         int count = 0; 
//         while (n > 0) { 
//             count += n & 1; 
//             n >>= 1; 
//         } 
//         return count; 
//     }