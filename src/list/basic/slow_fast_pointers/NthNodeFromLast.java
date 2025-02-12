package list.basic.slow_fast_pointers;

public class NthNodeFromLast {

    Node head = null;
    Node tail = null;
    int size = 0;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    int size() {
        return size;
    }

    void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            insertAtHead(data);
        } else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Please enter a valid index");
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

        Node node = new Node(data);
        Node temp = head;

        for (int i = 1; i <= index - 1; i++) { // Fix: Stop before index
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size++;
    }

    int nthNodeFromLast(int index) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= index; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        NthNodeFromLast list = new NthNodeFromLast();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        int result = list.nthNodeFromLast(1);
        int result2 = list.nthNodeFromLast(2);
        int result3 = list.nthNodeFromLast(3);
        int result4 = list.nthNodeFromLast(4);
        int result5 = list.nthNodeFromLast(5);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
