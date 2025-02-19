package list.basic;

import java.util.HashMap;
import java.util.Map;

public class DeleteNodesFromList {
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

    void insertAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void insertAtTail(int val) {
        if (head == null) {
            insertAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // 10 20 30
    void insertAt(int index, int val) {

        if (index < 0 || index > size) { // ✅ Adjusted for valid range
            System.out.println("Invalid index: " + (index + 1));
            return;
        }

        if (index == 0) {
            insertAtHead(val);
            return;
        }

        if (index == size) {
            insertAtTail(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) { // ✅ Correct iteration
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size++;
    }


    void display() {
        Node temp = head;
        if (head == null) return;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Node deleteNodesFromList(int[] arr, Node head) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Node dummy = new Node(-1);
        Node t = dummy;

        Node temp = head;
        while (temp != null) {
            if (map.containsKey(temp.data)) {
                temp = temp.next;
            } else {
                Node node = new Node(temp.data);
                t.next = node;
                t = node;
                temp = temp.next;
            }
        }
        return dummy.next;
    }


    // considering 0 index list
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        DeleteNodesFromList list = new DeleteNodesFromList();

        list.insertAt(0, 1);  // Inserts at head (0 internally)
        list.insertAt(1, 2);  // Inserts at index 1 (after 10)
        list.insertAt(2, 5);   // Inserts at index 1 (between 10 and 20)
        list.insertAt(3, 3);  // Inserts at end (index 3 internally)
        list.insertAt(4, 100);  // Inserts at end (index 3 internally)

        Node head = list.deleteNodesFromList(arr, list.head);
        list.head = head;

        list.display();
    }

}
