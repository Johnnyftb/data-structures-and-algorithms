package lists.doublyLinkedLists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }


        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
         if (tail == null) {
             head = node;
         } else {
             tail.setNext(node);
             node.setPrev(tail);
         }

         tail = node;
         size++;
    }

    public boolean addBefore(Employee employeeToAdd, Employee nextEmployee) {
        boolean employeeExists = false;

        EmployeeNode currentNode = head;
        EmployeeNode employeeToAddNode = new EmployeeNode(employeeToAdd);

        if (currentNode.getEmployee().equals(nextEmployee)) {
            head = employeeToAddNode;
            head.setNext(currentNode);
            currentNode.setPrev(employeeToAddNode);
            employeeExists = true;
            size++;
            return employeeExists;
        }

        while (currentNode.getNext() != null) {
            if (currentNode.getEmployee().equals(nextEmployee)) {
                EmployeeNode previousNode = currentNode.getPrev();

                previousNode.setNext(employeeToAddNode);
                employeeToAddNode.setPrev(previousNode);

                employeeToAddNode.setNext(currentNode);
                currentNode.setPrev(employeeToAddNode);
                employeeExists = true;
                size++;
                break;
            }

            currentNode = currentNode.getNext();
        }

        return employeeExists;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrev() == null) {
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }

        tail = tail.getPrev();
        size --;
        removedNode.setPrev(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }

        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
