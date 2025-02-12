//https://www.geeksforgeeks.org/problems/implement-stack-using-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-stack-using-array
class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // if(top == arr.length -1) return -1;
        top++;
        arr[top] = x;
    }

    public int pop() {
        // Your Code
        if(top == -1) return -1;
        int value = arr[top];
        top--;
        return value;
    }
}
