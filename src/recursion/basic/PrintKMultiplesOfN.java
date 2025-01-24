package recursion.basic;

public class PrintKMultiplesOfN {
    public static void main(String[] args) {
        printMultiples(5, 5);
    }

    static void printMultiples(int num, int multiples) {
        //base case
        if (multiples == 1) {
            System.out.println(num * multiples);
            return;
        }

        //sub work
        printMultiples(num, multiples - 1);

        // self work
        System.out.println(num * multiples);
    }
}
