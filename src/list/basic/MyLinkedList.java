package list.basic;

public class MyLinkedList {

    Node head = null;
    Node tail = null;
    int count = 0;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();  // Fix: Print a new line
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
        count++;
    }

    int size() {
        return count;
    }

    void insertAtTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp; // Fix: Assign tail
        } else {
            tail.next = temp;
            tail = temp;
        }
        count++;
    }

    void insertAt(int index, int data) {
        if (index < 0 || index > count) {
            System.out.println("Please enter a valid index");
            return;
        }

        if (index == 0) {
            insertAtHead(data);
            return;
        }

        if (index == count) {
            insertAtTail(data);
            return;
        }

        Node myNode = new Node(data);
        Node temp = head;

        for (int i = 1; i <= index - 1; i++) { // Fix: Stop before index
            temp = temp.next;
        }

        myNode.next = temp.next;
        temp.next = myNode;
        count++;
    }

    void deleteAt(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Wrong index");
            return;
        }
        Node temp = head;
        if (index == 0 && size() == 1) {
            head = null;
            tail = null;
        } else if (index > 0) {
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        count--;
    }

    int getAt(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Wrong index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertAtTail(0);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAt(0, 3);
        list.insertAtHead(100);
        list.insertAt(3, 4);
        list.deleteAt(4);
        list.display();
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 4: " + list.getAt(4));
        System.out.println("Element at index 3: " + list.getAt(3));
    }
}
