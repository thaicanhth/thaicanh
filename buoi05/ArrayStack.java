package buoi05;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] myStack;
    private int top = 0;
    public ArrayStack(int capacity) {
        myStack = new Employee[capacity];
    }
    public void push(Employee employee) {
        if (top == myStack.length) {
            Employee[] newArray = new Employee[2 * myStack.length];
            System.arraycopy(myStack, 0, newArray, 0, myStack.length);
            myStack = newArray;
        }
        myStack[top] = employee;
        top++;
    }
    public Employee pop()
    {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = myStack[--top];
        myStack[top]=null;
        return employee;
    }
    public Employee peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myStack[top-1];
    }
    public int size() {
        return top;
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public void printStack() {
        for (int i = top-1; i >= 0; i--) {
            System.out.println(myStack[i] + " ");
        }
    }

}
