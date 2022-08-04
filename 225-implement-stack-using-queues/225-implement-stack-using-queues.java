class MyStack {
    public Queue<Integer> s1;
    public Queue<Integer> s2;
    
    public MyStack() {
        this.s1 = new LinkedList<Integer>(); 
        this.s2 = new LinkedList<Integer>(); 
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.add(s1.poll());
        }
        
        s1.add(x);
        
        while(!s2.isEmpty()){
            s1.add(s2.poll());
        }
    }
    
    public int pop() {
        return this.s1.poll();
    }
    
    public int top() {
        return this.s1.peek();
    }
    
    public boolean empty() {
        return this.s1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */