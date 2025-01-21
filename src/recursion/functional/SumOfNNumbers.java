package recursion.functional;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int sum = sumOfNNumbers(3);
        System.out.println(sum);
    }

    private static int sumOfNNumbers(int n) {
        if (n == 1) return 1;
        else return n + sumOfNNumbers(n - 1);
    }
}
