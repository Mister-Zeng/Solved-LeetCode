class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(list, 0, 0, "", n);
        
        return list;
    }
    
    public void generateParenthesis(List<String> list, int left, int right, String s, int n) {
        if(s.length() == n * 2) {
            list.add(s);
            return;
        }
        
        if(left < n) {
            generateParenthesis(list, left + 1, right, s + "(", n);
        }
        
        if(right < left) {
            generateParenthesis(list, left, right + 1, s + ")", n);
        }
        
    }
}