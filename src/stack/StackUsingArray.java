package stack;

public class StackUsingArray {

    static class Stack {
        int[] arr = new int[10];
        int index = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[index] = x;
            index++;
        }

        int size() {
            return index;
        }

        int peek() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index - 1];
        }

        int pop() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        boolean isEmpty() {
            if (index == 0) return true;
            else return false;
        }

        boolean isFull() {
            if (index == arr.length) return true;
            else return false;
        }

        void display() {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }


    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.size());
        st.push(1);
        st.push(2);
        st.push(3);
        int pop = st.pop();
        System.out.println(pop);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.display();
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
    }
}
