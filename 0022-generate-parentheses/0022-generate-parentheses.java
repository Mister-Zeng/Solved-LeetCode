class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        generateParenthesis(list, 0, 0, s, n);
        
        return list;
    }
    
    public void generateParenthesis(List<String> list, int left, int right, StringBuilder s, int n) {
        if(s.length() == n * 2) {
            list.add(s.toString());

            return;
        }
        
        if(left < n) {
            generateParenthesis(list, left + 1, right, s.append("("), n);
            s.deleteCharAt(s.length() - 1);
        }
        
        if(right < left) {
            generateParenthesis(list, left, right + 1, s.append(")"), n);
            s.deleteCharAt(s.length() - 1);
        }
        
    }
}