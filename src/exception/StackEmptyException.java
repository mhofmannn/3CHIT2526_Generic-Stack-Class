package exception;

/**
 * Exception thrown when attempting to pop
 * or peek from an empty stack.
 */
public class StackEmptyException extends Exception {
    /**
     * Creates a StackEmptyException with a default message.
     */
    public StackEmptyException() {
        super("Stack is empty. No elements available.");
    }
}