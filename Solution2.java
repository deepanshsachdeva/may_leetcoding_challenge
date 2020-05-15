class Solution {
    public int numJewelsInStones(String J, String S) {
        int k = 0;
        List<Character> jewels = new ArrayList<>();
        
        for (int i = 0; i < J.length(); i++) {
            jewels.add(J.charAt(i));
        }
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            if (jewels.contains(c)) {
                k++;
            }
        }
        
        return k;
    }
}