class Solution {
    public int[] sortArray(int[] nums) {
    int length = nums.length;
    if (length <= 1) {
      return nums;
    }
    int mid = Math.floorDiv(length, 2);
    int[] leftArray = Arrays.copyOfRange(nums, 0, mid);
    int[] rightArray = Arrays.copyOfRange(nums, mid, length);
    return merge(sortArray(leftArray), sortArray(rightArray));
  }

    public int[] merge(int[] left, int[] right) {
    int[] merged = new int[left.length + right.length];
    int leftPos = 0;
    int rightPos = 0;
    int curIndex = 0;

    while (left.length > leftPos && right.length > rightPos) {
      if (left[leftPos] < right[rightPos]) {
        merged[curIndex] = left[leftPos];
        leftPos++;
      } else {
        merged[curIndex] = right[rightPos];
        rightPos++;
      }
      curIndex++;
    }

    System.arraycopy(left, leftPos, merged, curIndex, left.length - leftPos);
    System.arraycopy(right, rightPos, merged, curIndex, right.length - rightPos);

    return merged;
  }
    
    // Sorting helper function 
    // public void swap(int[] nums, int indexOne, int indexTwo) {
    
    //     int temp = nums[indexTwo];
    //     nums[indexTwo] = nums[indexOne];
    //     nums[indexOne] = temp;
    // }
    
    // Bubble Sort
    // public int[] sortArray(int[] nums) {
    //     for(int i = 0; i < nums.length; i++) {
    //         for(int j = 1; j < nums.length - i ; j++) {
    //             if(nums[j] < nums[j - 1]) {
    //                 swap(nums, j, j - 1);
    //             }
    //         }
    //     }
    //     return nums;
    // }
    
    // Insertion Sort 
    // public int[] sortArray(int[] nums) {
    //     for(int i = 1 ; i < nums.length ; i++) {
    //         int current = nums[i];
    //         int j = i - 1;
    //         while(j >= 0 && nums[j] > current) {
    //             nums[j + 1] = nums[j];
    //             j--;
    //         }
    //         nums[j + 1] = current;
    //     }
    //     return nums;
    // } 
    
    // Selection Sort
    // public int[] sortArray(int[] nums) {
    //     for(int i = 0 ; i < nums.length - 1; i++) {
    //         int currentMinIndex = i;
    //         for(int j = i + 1 ; j < nums.length ; j++) {
    //             if(nums[j] < nums[currentMinIndex]) {
    //                 currentMinIndex = j;
    //             }
    //         }
    //         swap(nums, i, currentMinIndex);
    //     }
    //     return nums;
    // }
}