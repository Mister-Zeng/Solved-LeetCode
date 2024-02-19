class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int len = n / 2; len > 0; len--) {
            if(n % len == 0) {
                int num_repeats = n / len;
                String substring = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < num_repeats; i++) {
                    sb.append(substring);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
