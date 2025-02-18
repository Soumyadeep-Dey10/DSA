//https://leetcode.com/problems/implement-stack-using-queues/submissions/1334253798/
class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int s = q.size();
        q.offer(x);
        for(int i = 1; i <= s; i++){
            q.offer(q.peek());
            q.poll();
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
