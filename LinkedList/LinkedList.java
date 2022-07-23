public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Inset a node at the front of the list
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Inset a node after the given node
    public void insertAfter(Node prevNode, int newData){
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null!");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Insert a node at the end of a list
    public void append(int newData) {
        if (head == null) {
            head = new Node(newData);
            return;
        }

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }

        n.next = new Node(newData);
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // If head contains the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with 3 nodes
        LinkedList ll = new LinkedList();
        ll.push(7);
        ll.push(1);
        ll.push(3);
        ll.push(2);

        System.out.print("Created linked list is: ");
        ll.printList();

        ll.deleteNode(1);
        System.out.println("LinkedList after deletion of 1: ");
        ll.printList();
    }
}
