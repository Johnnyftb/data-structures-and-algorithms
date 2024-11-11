package lists.integerSinglyLinkedList;

public class IntegerLinkedList {
    private IntegerNode head;

    public void add(int value) {
        IntegerNode node = new IntegerNode(value);

        if (head == null) {
            head = node;
            return;
        }

        if (head.getValue() > node.getValue()) {
            node.setNext(head);
            head = node;
            return;
        }

        IntegerNode currentNode = head;

        while (currentNode.getNext() != null && currentNode.getNext().getValue() < node.getValue()) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getNext() == null) {
            currentNode.setNext(node);
        } else {
            node.setNext(currentNode.getNext());
            currentNode.setNext(currentNode);
        }
    }

    public void printList() {
        System.out.print("Head -> ");
        IntegerNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.getValue());
            System.out.print(" -> ");
            currentNode = currentNode.getNext();
        }

        System.out.print("null");
    }
}
