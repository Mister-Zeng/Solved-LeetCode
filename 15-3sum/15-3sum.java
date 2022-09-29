class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
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
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        return new ArrayList(result);
    }
}