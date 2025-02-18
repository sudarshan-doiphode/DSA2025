package list.basic;

public class RemoveDuplicatesFromList {

    Node head = null;
    Node tail = null;
    int size = 0;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    void insertAtHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void insertAtTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            insertAtHead(data);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    void insertAt(int index, int data) {
        Node node = new Node(data);
        if (index < 0 || index > size) {
            System.out.println("Invalid index ❌");
            return;
        }

        if (index == 0) {
            insertAtHead(data);
            return;
        }

        if (index == size) {
            insertAtTail(data);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void deleteAt(int index) {
        if (index < 0 || index >= size) { // ✅ Fixed condition
            System.out.println("Invalid index ❌");
            return;
        }

        // ✅ Case 1: Delete head node
        if (index == 0) {
            head = head.next;
            if (head == null) { // ✅ If list becomes empty, reset tail
                tail = null;
            }
            size--;
            return;
        }

        // ✅ Traverse to node before the one to delete
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // ✅ Case 2: Delete last node (update tail)
        if (temp.next == tail) {
            tail = temp;
        }

        // ✅ Unlink the node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        size--;
    }

    // 1 1 1 2 2 3 null
    Node removeDuplicates(Node head) {
        Node dummy = new Node(-1);
        Node dummyHead = dummy;
        Node temp = head;
        if (head == null) return null;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp = temp.next;
            } else {
                Node node = new Node(temp.data);
                dummyHead.next = node;
                dummyHead = node;
                temp = temp.next;
            }
        }
        // perform this for last node
        if (temp != null) {
            dummyHead.next = temp;
        }
        return dummy.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromList list = new RemoveDuplicatesFromList();
        list.insertAtTail(1);
        list.insertAtTail(1);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(2);
        list.insertAtTail(3);
        Node head = list.removeDuplicates(list.head);
        list.head = head;
        list.display();
    }
}
