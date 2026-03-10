class MyStack {
    Deque<Integer> q=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.addLast(x);
    }
    
    public int pop() {
        int val=q.peekLast();
        q.pollLast();
        return val;
    }
    
    public int top() {
        int val=q.peekLast();
        return val;
    }
    
    public boolean empty() {
        return q.isEmpty();
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
