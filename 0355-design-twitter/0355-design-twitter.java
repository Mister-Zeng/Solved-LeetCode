class Twitter {
    
    int time;
    List<int[]>[] tweets;
    Set<Integer>[] followees;

    public Twitter() {
        
        time = 0;
        tweets = new List[501];
        followees = new Set[501];
    }
    
    public void postTweet(int userId, int tweetId) {
        
        ++time;
        if (tweets[userId] == null) {
            tweets[userId] = new ArrayList<> ();
            follow (userId, userId);
        }
        
        tweets[userId].add (new int[] {time, tweetId});
    }
   
    public List<Integer> getNewsFeed(int userId) {
        
        if (followees[userId] == null) {
            return new ArrayList<> ();
        }
        
        List<Integer> newsFeed = new ArrayList<> ();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<> ((tweet1, tweet2) -> tweet2[0] - tweet1[0]);
        
        for (int followee : followees[userId]) {
            if (tweets[followee] == null) {
                continue;
            }
            
            for (int[] tweet : tweets[followee]) {
                maxHeap.offer (tweet);
            }
        }
        
        while (!maxHeap.isEmpty () && newsFeed.size () < 10) {
            newsFeed.add (maxHeap.poll ()[1]);
        }
        
        return newsFeed;
    }
    
    public void follow(int followerId, int followeeId) {
        
        if (followees[followerId] == null) {
            followees[followerId] = new HashSet<> ();
            followees[followerId].add (followerId);
        }
        
        followees[followerId].add (followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        
        followees[followerId].remove (followeeId);
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