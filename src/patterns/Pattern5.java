package patterns;

/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */

public class Pattern5 {
    public static void main(String[] args) {
        for (int row = 5; row > 0 ; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
