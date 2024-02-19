class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();
        String merge = s.substring(1, size) + s.substring(0, size - 1);
        return merge.contains(s);
    }
}