package recursion.functional;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

    private static int sumOfDigits(int num) {
        //base
        if (num == 0 || num <= 9) return num;

        // sub-work recursively
        int smallAns = sumOfDigits(num / 10);

        //self work
        return smallAns + num % 10;
    }
}
