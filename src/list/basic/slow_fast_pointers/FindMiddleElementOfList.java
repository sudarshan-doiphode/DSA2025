package list.basic.slow_fast_pointers;

public class FindMiddleElementOfList {

    Node head = null;
    Node tail = null;
    int size =0;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    int size() { return size; }

    void insertAtHead(int data){
        Node temp = new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else {
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void insertAtTail(int data){
        Node node = new Node(data);
        
    }

    public static void main(String[] args) {

    }
}
