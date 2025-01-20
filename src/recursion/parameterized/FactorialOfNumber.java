package recursion.parameterized;

public class FactorialOfNumber {
    public static void main(String[] args) {
        factorialOfNumber(5, 1);
    }

    public static void factorialOfNumber(int n, int fact) {
        if (n < 1) {
            System.out.println(fact);
            return;
        }
        factorialOfNumber(n - 1, n * fact);
    }
}
