class Solution {
    public int findComplement(int num) {
        String bnum = Integer.toBinaryString(num);
        Integer c = 0;
        Integer k = 0;
        for (int i=bnum.length()-1; i>0; i--){
            if (bnum.charAt(i) == '0') {
                c += (int)Math.pow(2,k);
            }
            
            k++;
        }
        
        return c;
    }
}