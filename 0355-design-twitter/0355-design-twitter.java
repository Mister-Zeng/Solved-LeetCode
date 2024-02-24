class Twitter {

    int time;
    Map<Integer, List<int[]>> tweetMap;
    Map<Integer, Set<Integer>> followMap;
    
    public Twitter() {
        
        time = 0;
        tweetMap = new HashMap<> ();
        followMap = new HashMap<> ();
    }
    
    public void postTweet(int userId, int tweetId) {
        
        ++time;
        List<int[]> list = tweetMap.getOrDefault (userId, new ArrayList<> ());
        list.add (new int[] {time, tweetId});
        tweetMap.put (userId, list);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<> ((arr1, arr2) -> arr2[0] - arr1[0]);
        
        if (tweetMap.containsKey (userId)) {
            for (int[] arr : tweetMap.get (userId)) {
                maxHeap.offer (arr);
            }
        }
        
        if (followMap.containsKey (userId)) {
            for (int followee : followMap.get (userId)) {
                if (tweetMap.containsKey (followee)) {
                    for (int[] arr : tweetMap.get (followee)) {
                        maxHeap.offer (arr);
                    }
                }
            }
        }
        
        List<Integer> answer = new ArrayList<> ();
        
        while (!maxHeap.isEmpty () && answer.size () < 10) {
            int[] arr = maxHeap.poll ();
            answer.add (arr[1]);
        }
        
        return answer;
    }
    
    public void follow(int followerId, int followeeId) {
        
        Set<Integer> set = followMap.getOrDefault (followerId, new HashSet<> ());
        set.add (followeeId);
        followMap.put (followerId, set);
    }
    
    public void unfollow(int followerId, int followeeId) {
        
        Set<Integer> set = followMap.getOrDefault (followerId, new HashSet<> ());
        set.remove (followeeId);
        followMap.put (followerId, set);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */