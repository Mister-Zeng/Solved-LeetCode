class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                int target = 0 - nums[i];

                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        ArrayList<Integer> sol = new ArrayList<>();
                        sol.add(nums[i]);
                        sol.add(nums[left]);
                        sol.add(nums[right]);
                        result.add(sol);
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}