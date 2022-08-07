class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

		// number and it's corresponding index
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < nums.length; index++) {

			if (!map.containsKey(nums[index])) {

				map.put(target - nums[index], index);

			} else {
				result[0] = index;
				result[1] = map.get(nums[index]);
				break;
			}
		}
    return result;
    }
}