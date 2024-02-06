class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#' && sStack.size() > 0) {
                sStack.pop();
            } else if(s.charAt(i) != '#') {
                sStack.push(s.charAt(i));
            }
        }
        
        for(int j = 0; j < t.length(); j++) {
            if(t.charAt(j) == '#' && tStack.size() > 0) {
                tStack.pop();
            } else if(t.charAt(j) != '#') {
                tStack.push(t.charAt(j));
            }
        }
        
        while(!sStack.isEmpty()){
            s1.append(sStack.pop());
        }
        
        while(!tStack.isEmpty()){
            t1.append(tStack.pop());
        }
        
        return s1.toString().equals(t1.toString());
        
    }
}