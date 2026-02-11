package main;

import stack.Stack;
import exception.StackEmptyException;
import exception.StackFullException;

/**
 * Test class for the generic Stack.
 * This class demonstrates the functionality of the stack
 * using both Integer and String data types.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<>(3); //Create a stack for Integer values with capacity 3
        try {
            //Push three numbers onto the stack
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);

            //numberStack.push(4); //test StackFullException

            System.out.println("Number stack: " + numberStack.list()); //Print all elements in the stack
            System.out.println("Peek: " + numberStack.peek()); //Display the top element without removing it
            System.out.println("Pop: " + numberStack.pop()); //Remove and print the top element
            System.out.println("After pop: " + numberStack.list()); //Show the stack after popping one element
        } catch(StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage()); //Print the exception message if an error occurs
        }
        System.out.println(); //Print empty line for better readability
        Stack<String> textStack = new Stack<>(2); //Create a stack for String values with capacity 2
        try {
            //Push two text elements onto the stack
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text stack: " + textStack.list()); //Print all elements in the stack
            System.out.println("Peek: " + textStack.peek()); //Display the top element without removing it
            System.out.println("Pop: " + textStack.pop()); //Remove and print the top element

            //test StackEmptyException
            //textStack.pop();
            //textStack.pop();

            System.out.println("After pop: " + textStack.list()); //Show the stack after popping one element
        } catch(StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage()); //Print the exception message if an error occurs
        }
    }
}