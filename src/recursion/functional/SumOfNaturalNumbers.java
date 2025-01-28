package recursion.functional;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNums(5));
    }

    private static int sumOfNaturalNums(int i) {
        if (i == 0) return 0;

        // sub-work recursive
        int smallAns = sumOfNaturalNums(i - 1);

        //self-work
        if (i % 2 == 0 && i > 1) {
            return smallAns - i;
        } else return smallAns + i;
    }
}
