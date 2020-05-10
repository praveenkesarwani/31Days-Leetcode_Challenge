// Find the Town Judge
class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length == 0) { // N = 1 [] (edge case)
            return 1;
        }
        Set<Integer> set = new HashSet<>(); // to store trust[i][0]
        Map<Integer, Integer> map = new HashMap<>(); // to store trust[i][1] with their frequency
        // store values in set and map
        for (int i = 0; i < trust.length; i++) {
            set.add(trust[i][0]);
            map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
        }
        int n = set.size(); // size of set

        int count = 0; // to handle the case when every person trusts more than one person*
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                ans = entry.getKey();
                count++;
            }
        }
        if (count == 1) {
            return ans;
        }
        return -1;
    }
}
// * [[1,8],[1,3],[2,8][2,3],[4,8],[4,3]] violating the 3rd constraint