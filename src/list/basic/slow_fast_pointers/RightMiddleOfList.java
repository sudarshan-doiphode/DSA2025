package list.basic.slow_fast_pointers;

public class RightMiddleOfList {

    Node head = null;
    Node tail = null;
    int size = 0;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    int size(){
        return size;
    }

    void insertAtHead(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else {
            node.next=head;
            head=node;
        }
        size++;
    }

    void insertAtTail(int data){
        Node node = new Node(data);
        if(head==null){
            insertAtHead(data);
        }
        else {
            tail.next=node;
            tail=node;
            size++;
        }
    }

    Node rightMiddle(){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        RightMiddleOfList oddList = new RightMiddleOfList();
        oddList.insertAtTail(10);
        oddList.insertAtTail(20);
        oddList.insertAtTail(30);

        Node oddMiddle = oddList.rightMiddle();
        System.out.println(oddMiddle.data);

        RightMiddleOfList evenList = new RightMiddleOfList();
        evenList.insertAtTail(10);
        evenList.insertAtTail(20);
        evenList.insertAtTail(30);
        evenList.insertAtTail(40);
        Node evenMiddle = evenList.rightMiddle();
        System.out.println(evenMiddle.data);


    }
}
