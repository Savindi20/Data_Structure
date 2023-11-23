package lk.ijse.ds.linkedlist;

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
}