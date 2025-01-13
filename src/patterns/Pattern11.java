package patterns;

/*

1
01
101
0101
10101

*/

public class Pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = start > 0 ? 0 : 1;
            }
            System.out.println();
        }
    }
}
