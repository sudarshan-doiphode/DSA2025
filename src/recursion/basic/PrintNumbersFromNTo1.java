package recursion.basic;

public class PrintNumbersFromNTo1 {
    public static void main(String[] args) {
        printNumbers(10);
    }

    private static void printNumbers(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printNumbers(--n);
    }
}
