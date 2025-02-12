//https://leetcode.com/problems/min-stack/
class MinStack {
    int top ;
    int[] arr ;
    int[] minstack;
    public MinStack() {
        top = -1;
        arr = new int[10000];
        minstack = new int[10000];
    }
    
    public void push(int val) {
        top++;
        arr[top] = val;

        //min element in the first index
        if(top == 0){
            minstack[top] = val; //if no element present 
        }
        else{
            minstack[top] = Math.min(minstack[top-1], val);
        }
    }
    
    public void pop() {
        if (top == -1) return;
        top--;
    }
    
    public int top() {
        if(top == -1) return -1;
        return arr[top];
    }
    
    public int getMin() {
        return minstack[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */