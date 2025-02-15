package list.basic.slow_fast_pointers;

public class IntersectionOfTwoList {
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
            return;
        } else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }

    void insertAt(int index, int data) {
        if (index < 0 || index > size) {
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
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node intersectionOfLists(IntersectionOfTwoList list1, IntersectionOfTwoList list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        int size1 = list1.size();
        int size2 = list2.size();
        if (size1 > size2) {
            for (int i = 1; i <= size1 - size2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 1; i <= size2 - size1; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1.data != temp2.data) {
            temp2 = temp2.next;
            temp1 = temp1.next;
        }

        return temp2;
    }

    static void display(Node head) {
        if (head == null) {
            return;
        } else {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }

    // List does not actually share same Node objects here. Make sure while moving pointer you check actually values.
    // This question you should solve on LeetCode. This is just demo
    public static void main(String[] args) {
        IntersectionOfTwoList list1 = new IntersectionOfTwoList();
        list1.insertAtTail(87);
        list1.insertAtTail(100);
        list1.insertAtTail(13);
        list1.insertAtTail(4);
        list1.insertAtTail(5);
        list1.insertAtTail(12);
        list1.insertAtTail(10);

        IntersectionOfTwoList list2 = new IntersectionOfTwoList();
        list2.insertAtTail(90);
        list2.insertAtTail(9);
        list2.insertAtTail(5);
        list2.insertAtTail(12);
        list2.insertAtTail(10);

        Node result = intersectionOfLists(list1, list2);
        display(result);

    }
}
