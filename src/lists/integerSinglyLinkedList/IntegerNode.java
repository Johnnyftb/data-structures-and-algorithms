package lists.integerSinglyLinkedList;

public class IntegerNode {
    private IntegerNode next;
    private int value;

    public IntegerNode(int value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }
}
