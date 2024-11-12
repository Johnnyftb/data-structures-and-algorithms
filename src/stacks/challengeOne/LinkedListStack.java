package stacks.challengeOne;

import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<String> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(String s) {
        stack.push(s);
    }

    public String pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
