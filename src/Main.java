// Example usage:
public class Main {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(5);

        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);

        System.out.println(stackArray.pop()); // Output: 3
        System.out.println(stackArray.peek()); // Output: 2

        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6); // Output: StackArray Overflow

        while (!stackArray.isEmpty()) {
            System.out.print(stackArray.pop() + " "); // Output: 5 4 2 1
        }


        StackLinkedList stack = new StackLinkedList(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.peek()); // Output: 2

        stack.push(4);
        stack.push(5);
        stack.push(6); // Output: Stack Overflow

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // Output: 5 4 2 1
        }
    }
}