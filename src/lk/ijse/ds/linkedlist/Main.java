package lk.ijse.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);

        ll.insertAtEnding(40);
        ll.insertAtEnding(50);

        ll.insertAtBeginning(60);
        ll.insertAtEnding(70);

        ll.traverse();
    }
}