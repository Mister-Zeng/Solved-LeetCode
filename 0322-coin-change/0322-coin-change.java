class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0; 
        
        LinkedList<Integer> queue = new LinkedList<>();
        // tracking sum in queue
        queue.add(0);
        int coinCount = 0; 
        boolean[] visited = new boolean[amount + 1];
        
        while(!queue.isEmpty()) {
            int length = queue.size();
            
            for(int i = 0; i < length; i++) {
                int sum = queue.poll();
                
                if(sum == amount) return coinCount;
                
                if(sum > amount || visited[sum]) continue;
                
                visited[sum] = true; 
                
                for(int c : coins) {
                    queue.add(sum + c);
                }
            }
            
            coinCount++;
        } 
        
        return -1; 
    }
}