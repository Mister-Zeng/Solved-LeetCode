class Solution {
    public String reverseWords(String s) {
        String[] arr = s.replaceAll("( )+", " ").trim().split(" ");
        
        String[] reversed = new String[arr.length];
        
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            reversed[j] = arr[i];
            j++;
        }
        
        return String.join(",",reversed).replaceAll(","," ");
    }
    
}