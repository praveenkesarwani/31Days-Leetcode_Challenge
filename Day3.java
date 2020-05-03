class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>map = new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0;i < magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
                if(map.get(magazine.charAt(i)) == 0){
                    map.remove(magazine.charAt(i));
                }
            }
        }
        if(map.size() == 0){
            return true;
        }
        return false;
    }
}