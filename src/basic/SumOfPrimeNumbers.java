package basic;

import java.util.Arrays;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int num = 34;
        int[] ans = getPrimeValues(num);
        Arrays.stream(ans).forEach(s -> System.out.println(s + " "));
    }

    static int[] getPrimeValues(int num) {
        int[] ans = new int[2];
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                ans[0] = i;
                ans[1] = num - i;
                break;
            }
        }
        return ans;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
