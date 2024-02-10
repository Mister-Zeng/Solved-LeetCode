class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '(') {
                count++;
            } else if(sb.charAt(i) == ')') {
                if(count == 0) {
                    sb.setCharAt(i, '#');
                } else {
                    count--;
                }

            }
        }

        for (int i = sb.length() - 1; i >= 0; i--) {
            if(sb.charAt(i) == '(' && count > 0) {
                sb.setCharAt(i, '#');
                count--;
            }
        }


        return sb.toString().replaceAll("#", "");
    }
}