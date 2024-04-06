class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    // Creating a stack
    StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation to insert an element on the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("StackArray Overflow");
            System.exit(1);
        }

        arr[++top] = x;
    }

    // Pop operation to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("StackArray Underflow");
            System.exit(1);
        }

        return arr[top--];
    }

    // Peek operation to return the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("StackArray Underflow");
            System.exit(1);
        }

        return arr[top];
    }

    // Helper function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Helper function to check if the stack is full
    private boolean isFull() {
        return top == capacity - 1;
    }
}