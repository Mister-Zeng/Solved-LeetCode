class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int gcdNum = gcd(str1Length, str2Length);
        String common = str1.substring(0, gcdNum);
        
        String str = str1 + str2;
        for (int i = 0; i < str1Length + str2Length; i += gcdNum) {
            if (!str.startsWith(common, i)) 
                return "";        
        }
        
        return common;
    }
    
    private int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
