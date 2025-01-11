package patterns;

/*
 *********
 *******
 *****
 ***
 *

 */

public class Pattern8 {
    public static void main(String[] args) {
        pattern();
    }

    private static void pattern() {
        int c = 2 * 5 - 1;
        for (int row = 0; row < 5; row++) {

            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < c; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            c -= 2;
            System.out.println();
        }
    }
}
