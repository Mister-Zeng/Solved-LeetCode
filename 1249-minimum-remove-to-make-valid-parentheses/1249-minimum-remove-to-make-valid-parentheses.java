class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == '(') {
                count++;
            } else if(charArr[i] == ')') {
                if(count == 0) {
                    charArr[i] = '#';
                } else {
                    count--;
                }

            }
        }

        for (int i = charArr.length - 1; i >= 0; i--) {
            if(charArr[i] == '(' && count > 0) {
                charArr[i] = '#';
                count--;
            }
        }

        for(char c : charArr) {
            if(c != '#') sb.append(c);
        }


        return sb.toString();
    }
}