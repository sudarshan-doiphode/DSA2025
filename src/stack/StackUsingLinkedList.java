package stack;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        Node head = null;
        private int size = 0;

        void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek() {
            if (head != null) {
                return head.data;
            } else {
                System.out.println("Stack is empty!");
                return -1;
            }
        }

        int pop() {
            if (head != null) {
                int data = head.data;
                head = head.next;
                size--;
                return data;
            } else {
                System.out.println("Stack is empty!");
                return -1;
            }
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size() == 0) return true;
            else return false;
        }

        private void displayRecursion(Node head) {
            if (head == null) return;
            displayRecursion(head.next);
            System.out.print(head.data + " ");
        }

        void display() {
            displayRecursion(head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.peek();
        st.push(1); // 1
        st.push(2); // 1 2
        st.push(3); // 1 2 3
        st.push(4); // 1 2 3 4
        st.pop(); // 1 2 3
        st.display(); // 1 2 3
        if (st.isEmpty()) System.out.println("Stack is empty");
        else System.out.println("No!!!");
        System.out.println(st.peek());
    }
}
