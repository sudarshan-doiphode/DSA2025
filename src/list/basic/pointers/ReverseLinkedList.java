package list.basic.pointers;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        static Node reverse(Node head) {
            Node before = null;
            Node current = head;
            Node after = null;
            // Remember this 4 steps : 1.after = current.next 2.current.next=before;  3.before=current;  4.current=after
            while (current != null) {
                after = current.next;
                current.next = before;
                before = current;
                current = after;
            }
            return before;
        }

        static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node node1 = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);
            Node node6 = new Node(6);
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = node6;
            Node reverse = reverse(node1);
            display(reverse);
        }
    }
}
