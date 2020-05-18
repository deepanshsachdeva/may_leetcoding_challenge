class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList();
        
        if (s.length() == 0 || p.length() == 0 || p.length()> s.length()) return answer;
        
        int[] p_map = new int[26];
        for (int i=0; i<p.length(); i++) {
            p_map[p.charAt(i)-'a']++;
        }
        
        for (int i=0; i<=s.length()-p.length(); i++){
            if (checkAnagramWindow(s, i, i+p.length(), p_map))
                answer.add(i);
        }
        
        return answer;
    }
    
    private boolean checkAnagramWindow(String s, int start, int end, int[] p_map){
        int[] map = new int[26];
        
        for (int k=start; k<end; k++) {
            map[s.charAt(k)-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(map[i] != p_map[i]) return false;
        }
        return true;
    }
}