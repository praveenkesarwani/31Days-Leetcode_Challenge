// Sort Characters By Frequency
class Solution {
    public String frequencySort(String s) {
        // build frequency map
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        // build priority queue
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
        // add the frequency map to priority queue
        maxHeap.addAll(freq.keySet());
        StringBuilder sb = new StringBuilder();
        // fill the map from priority queue to output list and return it
        while (maxHeap.size() > 0) {
            char c = maxHeap.remove();
            for (int i = 0; i < freq.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
/*
Time Complexity: O(NlogN)
*/