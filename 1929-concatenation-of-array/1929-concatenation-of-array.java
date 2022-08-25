class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length + length];
        
        System.arraycopy(nums, 0, newArr, 0, length);
        System.arraycopy(nums, 0, newArr, length, length);
            
        return newArr;
    }
}