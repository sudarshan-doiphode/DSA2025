package recursion.functional;

public class FibonnaciNumber {
    public static void main(String[] args) {
        int i = nthFibbonacciNumber(6);
        System.out.println(i);
    }

    private static int nthFibbonacciNumber(int i) {
        //base condition
        if (i == 0 || i == 1) {
            return i;
        }

        //sub work
        // current number = fib(n-1) + fib(n-2)
        int prev = nthFibbonacciNumber(i - 1);
        int prevOfPrev = nthFibbonacciNumber(i - 2);

        //self work
        return prev + prevOfPrev;

    }
}
