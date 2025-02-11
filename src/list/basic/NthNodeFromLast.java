package list.basic;

public class NthNodeFromLast {

    Node head = null;
    Node tail = null;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void addAtHead(int data) {
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

    void addAtTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            addAtHead(data);
        } else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    // 10 20 30 40 50
    void addAt(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Please enter a valid index");
            return;
        }

        if (index == 0) {
            addAtHead(data);
            return;
        }

        if (index == size) {
            addAtTail(data);
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

    // 10 20 30 40 50 60
    int nthNodeFromLast(int index) {
        Node temp = head;
        int size = size();
        int lastIndex = size - index; //6-3=3  // 0 , 1 ,2 ,3-> O based index
        for (int i = 0; i < lastIndex - 1; i++) {
            temp = temp.next;
        }
        return temp.next.data;
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        NthNodeFromLast list = new NthNodeFromLast();
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(60);
        int result = list.nthNodeFromLast(3);
        System.out.println(result);
    }
}
