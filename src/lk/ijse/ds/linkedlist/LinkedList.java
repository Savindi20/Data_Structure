package lk.ijse.ds.linkedlist;

/*class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
}*/
public class LinkedList {
    private Node head;

    public void insertAtBeginning(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void insertAtEnding(int data) {
        if (head == null) {
            insertAtBeginning(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node node = new Node(data);

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.err.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnding() {
        if(head == null) {
            System.err.println("List is empty");
            return;
        }
        Node temp = head;

        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int position) {
        if(head == null) {
            System.err.println("List is empty");
            return;
        }

        if(position == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void traverse() {
        System.out.print("[");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

    }
}