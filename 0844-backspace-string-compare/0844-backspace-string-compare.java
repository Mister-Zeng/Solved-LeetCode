class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#') {
                s1.append(s.charAt(i));
            } else if(s.charAt(i) == '#') {
                if(s1.length() > 0) {
                    int removedIndex = s1.length() - 1;
                    s1.deleteCharAt(removedIndex);
                }
            }
        }
        
        for(int j = 0; j < t.length(); j++) {
            if(t.charAt(j) != '#') {
                t1.append(t.charAt(j));
            } else if(t.charAt(j) == '#') {
                if(t1.length() > 0) {
                    int removedIndex = t1.length() - 1;
                    t1.deleteCharAt(removedIndex);
                }   
            }
        }
        
        return s1.toString().equals(t1.toString());
    }
}
