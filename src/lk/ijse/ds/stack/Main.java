package lk.ijse.ds.stack;


public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peeked: " + stack.peek());

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Peeked: " + stack.peek());
    }
}