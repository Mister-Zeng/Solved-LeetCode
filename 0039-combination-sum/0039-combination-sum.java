class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, target, curr, result, 0);
        return result;
    }
    
    public void backtrack(int[] candidates, int target, List<Integer> curr, List<List<Integer>> result, int index) {
        if(target == 0) {
            result.add(new ArrayList<>(curr));
        } else if(target < 0 || index >= candidates.length) {
            return;
        } else {
            curr.add(candidates[index]);
            backtrack(candidates, target - candidates[index], curr, result, index);
            
            curr.remove(curr.get(curr.size() - 1));
            backtrack(candidates, target, curr, result, index + 1);
        }
    }
}