class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            
            count.put(c, 1+count.getOrDefault(c,0));
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            
            int k = count.getOrDefault(c,0);
            
            if (k == 0) {
                return false;
            }else {
                count.put(c, k-1);
            }
        }
        
        return true;
    }
}