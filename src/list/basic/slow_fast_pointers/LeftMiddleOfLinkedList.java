package list.basic.slow_fast_pointers;

public class LeftMiddleOfLinkedList {
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
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    Node leftMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LeftMiddleOfLinkedList list = new LeftMiddleOfLinkedList();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        Node result = list.leftMiddleNode();
        System.out.println(result.data); // odd list

        //For even list
        LeftMiddleOfLinkedList list2 = new LeftMiddleOfLinkedList();
        list2.insertAtTail(1);
        list2.insertAtTail(2);
        list2.insertAtTail(3);
        list2.insertAtTail(4);
        list2.insertAtTail(5);
        list2.insertAtTail(6);
        Node node = list2.leftMiddleNode();
        System.out.println(node.data);
    }


}
