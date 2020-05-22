class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> char_map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            char_map.put(c, char_map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((x,y) -> y.getValue() - x.getValue());
        
        pq.addAll(char_map.entrySet());
        
        StringBuilder sb = new StringBuilder();
        
        while (!pq.isEmpty()) {
            Map.Entry me = pq.poll();
            
            for (int i=0; i<(int)me.getValue(); i++) {
               sb.append(me.getKey()); 
            }
        }
        
        return sb.toString();
    }
}
