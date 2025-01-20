package recursion.functional;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("Factorial of number is: " + factorial);
    }

    private static int factorial(int i) {
        if (i == 1) return 1;
        else return i * factorial(i - 1);
    }
}
