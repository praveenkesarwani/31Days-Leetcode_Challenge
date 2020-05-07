//space complexicity : O(n)
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>map = new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index = 0;
        for(char i:s.toCharArray()){
            if(map.get(i) == 1){
                return index;
            }
            index++;
        }
        return -1;
    }
}