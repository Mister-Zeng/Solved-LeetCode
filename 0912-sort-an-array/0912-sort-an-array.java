class Solution {
    public int[] sortArray(int[] nums) {
        int length = nums.length; 
        
        if(length <= 1){
            return nums;
        }
        
        int middle = Math.floorDiv(length,2);
        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int[] right = Arrays.copyOfRange(nums, middle, length);
        
        return merge(sortArray(left), sortArray(right));
    }
    
    public int[] merge(int[] leftArr, int[] rightArr) {
        int[] merged = new int[leftArr.length + rightArr.length];
        int leftPos = 0;
        int rightPos = 0;
        int current = 0;
        
        while(leftPos < leftArr.length && rightPos < rightArr.length) {
            if(leftArr[leftPos] < rightArr[rightPos]) {
            merged[current] = leftArr[leftPos];
            leftPos++;
        } else {
            merged[current] = rightArr[rightPos];
            rightPos++;
        }
            current++;
        }
        
        while(leftPos < leftArr.length) {
            merged[current] = leftArr[leftPos];
            leftPos++;
            current++;
        }
        
       while(rightPos < rightArr.length){
           merged[current] = rightArr[rightPos];
           rightPos++;
           current++;
       } 
        
        return merged;
        
    }
}