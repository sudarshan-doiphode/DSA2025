package list.basic.slow_fast_pointers;

public class Merge2List {

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

    int size() {
        return size;
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
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Merge2List merge2Lists(Merge2List list1, Merge2List list2) {
        Merge2List ansList = new Merge2List();
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        Node head = new Node(100);
        Node temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else if (temp1.data > temp2.data) {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            } else if (temp1.data == temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }

        Merge2List list = new Merge2List();
        list.head = head.next;
        return list;

    }

    public static void main(String[] args) {
        // 1 3 4 7 9 10
        Merge2List list1 = new Merge2List();
        list1.insertAtTail(1);
        list1.insertAtTail(3);
        list1.insertAtTail(4);
        list1.insertAtTail(7);
        list1.insertAtTail(9);
        list1.insertAtTail(10);

        // 2 5 6 8
        Merge2List list2 = new Merge2List();
        list2.insertAtTail(2);
        list2.insertAtTail(5);
        list2.insertAtTail(6);
        list2.insertAtTail(8);

        System.out.print("List 1: ");
        list1.displayList();
        System.out.print("List 2: ");
        list2.displayList();

        Merge2List mergedList = merge2Lists(list1, list2);
        System.out.print("Merged List: ");
        mergedList.displayList();


    }
}
