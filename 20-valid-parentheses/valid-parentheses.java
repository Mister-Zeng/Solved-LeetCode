class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) return false;

        for(Character c : s.toCharArray()) {
            if (stack.isEmpty() && (c == '}' || c == ']' || c == ')')) {
                return false;
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    } else if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                    } else {
                        stack.add(c);
                    }
                } else {
                    stack.add(c);
                }
            }
        }

        return stack.isEmpty();
    }
}