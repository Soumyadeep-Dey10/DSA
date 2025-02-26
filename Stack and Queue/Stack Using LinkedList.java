//https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1?utm_source=youtube
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
  void push(int a) {
        StackNode temp = new StackNode(a);
        // If the stack is empty, set top to the new node
        if (top == null) {
            top = temp;
        } else {
            // If the stack is not empty, push the new node to the top
            temp.next = top;
            top = temp;
        }
    }


    // Function to remove an item from top of the stack.
    int pop() {
        if (top == null) {
            return -1; // Stack is empty
        }
        StackNode temp = top;
        top = top.next; // Move top to the next node
        int poppedData = temp.data; // Store the data of the node being popped
        temp = null; // Clean up the popped node
        return poppedData;
    }
}
