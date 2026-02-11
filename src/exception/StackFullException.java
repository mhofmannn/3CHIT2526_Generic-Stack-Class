package exception;

/**
 * Exception thrown when attempting to push
 * an element onto a full stack.
 */
public class StackFullException extends Exception {
    /**
     * Creates a StackFullException with a default message.
     */
    public StackFullException() {
        super("Stack is full. Cannot push new element.");
    }
}