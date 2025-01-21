package recursion.parameterized;

public class SumOfNNumbers {
    public static void main(String[] args) {
        sumOfNNumber(3, 0);
    }

    private static void sumOfNNumber(int n, int sum) {
        if (n < 1) {
            System.out.print("Sum is " + sum);
            return;
        }
        int i = sum + n;
        sumOfNNumber(n - 1, i);
    }
}
