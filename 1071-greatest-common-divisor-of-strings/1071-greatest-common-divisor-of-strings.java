class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        
        int str1Length = str1.length();
        int str2Length = str2.length();
        int gcdNum = gcd(str1Length, str2Length);
        String common = str1.substring(0, gcdNum);
        
        return common;
    }
    
    private int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
