//Find All Anagrams in a String

class Solution {
    boolean exists(String s,String p){
        Map<Character,Integer>map = new HashMap<>();
        for(int i = 0;i < p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        for(int i = 0;i < s.length();i++){
            if(map.get(s.charAt(i)) == null){
                return false;
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i)) -1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
            }
        }
        if(map.size() == 0){
            return true;
        }
        return false;
    }
    String sort(String s){
        char[]arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        p = sort(p);
        int n = p.length();
        for(int i = 0;i <= s.length() - p.length();i++){
            String s1 = s.substring(i,i+n);
            if(p.equals(sort(s1))){
                ans.add(i);
            }
        }
        return ans;
    }
}