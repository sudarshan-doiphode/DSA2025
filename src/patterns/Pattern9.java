package patterns;

//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *

public class Pattern9 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // 0 7 0
    // 1 5 1
    // 2 3 2
    // 3 1 3
    private static void pattern2(int n) {
        int c = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            c-=2;
            System.out.println();
        }
    }
}
