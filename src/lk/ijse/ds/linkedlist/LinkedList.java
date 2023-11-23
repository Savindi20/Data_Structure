package lk.ijse.ds.linkedlist;

/*class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
}*/
public class LinkedList {
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }

    }
    private Node head;

    public void insertAtBeginning(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void insertAtEnding(int data) {
        if(head == null){
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

    public void traverse() {
        System.out.print("[");

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }
}