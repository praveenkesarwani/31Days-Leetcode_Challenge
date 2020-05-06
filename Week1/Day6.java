//Time complexity : O(n)
//Space complexity : O(n)

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;
        Map<Integer,Integer>map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i) > majority){
                return i;
            }
        }
        return -1;
    }
}