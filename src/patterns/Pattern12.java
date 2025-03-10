package patterns;

/*
1      1
12    21
123  321
12344321
*/
public class Pattern12 {
    public static void main(String[] args) {
        int space = 2 * (4 - 1);
        for (int i = 1; i <= 4; i++) {
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }


            //numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;

        }
    }
}
