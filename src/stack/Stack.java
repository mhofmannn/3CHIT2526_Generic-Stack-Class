package stack;

import exception.StackEmptyException;
import exception.StackFullException;

/**
 * Generic stack implementation using an array.
 * @param <T> the type of elements stored in the stack
 */
public class Stack<T> {
    private Object[] elements;
    private int top;

    /**
     * Default constructor.
     * Creates a stack with capacity 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * Constructor with custom capacity.
     * @param capacity maximum number of elements
     */
    public Stack(int capacity) {
        elements = new Object[capacity];
        top = 0;
    }

    /**
     * Pushes an element onto the stack.
     * @param value element to push
     * @throws StackFullException if the stack is full
     */
    public void push(T value) throws StackFullException {
        if(top == elements.length) {
            throw new StackFullException();
        }
        elements[top] = value;
        top++;
    }

    /**
     * Removes and returns the top element.
     * @return top element
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException {
        if(top == 0) {
            throw new StackEmptyException();
        }
        top--;
        return (T) elements[top];
    }

    /**
     * Returns the top element without removing it.
     * @return top element
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if(top == 0) {
            throw new StackEmptyException();
        }
        return (T) elements[top - 1];
    }

    /**
     * Returns all elements separated by semicolons.
     * @return concatenated stack elements
     */
    public String list() {
        String result = "";
        for(int i = 0; i < top; i++) {
            result = result + elements[i];
            if(i < top - 1) {
                result = result + ";";
            }
        }
        return result;
    }
}