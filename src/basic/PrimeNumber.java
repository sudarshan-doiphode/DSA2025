package basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 4;
        boolean prime = isPrime(num);
        System.out.println(prime);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        else if (num == 2) return true;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
