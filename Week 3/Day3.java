//Find All Anagrams in a String

class Solution {
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
    
    String sort(String s){
        char[]arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }
}