package list.basic.slow_fast_pointers;

public class NthNodeRemoveFromLast {
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
        Node node = new Node(data);
        if (index < 0 || index > size) {
            return;
        } else if (index == 0) {
            insertAtHead(data);
            return;
        } else if (index == size) {
            insertAtTail(data);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    // 10 20 30 40 50
    Node removeNthNodeFromLast(int index) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= index; i++) {
            fast = fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }


    void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        NthNodeRemoveFromLast list = new NthNodeRemoveFromLast();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        Node head = list.removeNthNodeFromLast(1);
        list.display(head);
    }
}
