class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character,Integer>map = new HashMap<>();
        for(char c:J.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans = 0;
        for(char c:S.toCharArray()){
            if(map.containsKey(c)){
                ans++;
            }
        }
        return ans;
    }
}