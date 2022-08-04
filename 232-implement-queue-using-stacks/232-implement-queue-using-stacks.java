class MyQueue {
    public Stack<Integer> s1;
    public Stack<Integer> s2;
    
    public MyQueue() {
       this.s1 = new Stack<>(); 
       this.s2 = new Stack<>(); 
    }
    
    public void push(int x) {
        while (s1.size() != 0) {
            s2.push(s1.pop());
        }
        s1.push(x);
        
        while (s2.size() != 0) {
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
         return this.s1.pop(); 
    }
    
    public int peek() {
        return this.s1.peek();
    }
    
    public boolean empty() {
        if(this.s1.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */