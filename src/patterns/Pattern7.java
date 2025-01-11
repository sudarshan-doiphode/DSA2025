package patterns;

/*

     *
    ***
   *****
  *******
 *********

 */

public class Pattern7 {
    public static void main(String[] args) {
        int total= 5;
        pattern(total);
    }

    private static void pattern(int total) {
        for (int row = 0; row < 5; row++) {
            //space
            for (int col = 0; col <= total -row-1; col++) {
                System.out.print(" ");
            }

            //star
            for (int col = 0; col < 2*row+1; col++) {
                System.out.print("*");
            }

            //space
            for (int col = 0; col <= total -row-1; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
