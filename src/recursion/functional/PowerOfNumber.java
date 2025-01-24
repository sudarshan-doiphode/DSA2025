package recursion.functional;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }

    static int power(int num, int pow) {
        // base condition
        if (pow < 1) return 1;

        //sub work
        int smallAns = power(num, pow - 1);

        // self work
        return smallAns * num;
    }
}
