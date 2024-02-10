class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        if(numRows == 1) return result; 
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> previousRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            
            for(int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }
            
            currentRow.add(1);
            result.add(currentRow);
        }
        
        return result;
    }
}