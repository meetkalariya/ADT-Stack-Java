# Stack Implementation in Java

This project contains two implementations of a stack data structure in Java: `StackArray` and `StackLinkedList`.

## Files

- `src/StackArray.java`: This file contains the `StackArray` class which implements a stack using an array.
- `src/StackLinkedList.java`: This file contains the `StackLinkedList` class which implements a stack using a linked list.
- `src/Main.java`: This file contains the `Main` class which demonstrates the usage of both `StackArray` and `StackLinkedList`.

## Usage

To use the `StackArray` or `StackLinkedList` class, create an instance of the class with the desired size, then use the `push`, `pop`, `peek`, `isEmpty`, and `isFull` methods as needed.

```java
StackArray stackArray = new StackArray(5);
stackArray.push(1);
stackArray.push(2);
int topElement = stackArray.pop();
