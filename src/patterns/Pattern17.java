package patterns;

/*
   A
  AAA
 AAAAA
AAAAAAA
*/
public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < 4; i++) {
            char a = 'A';
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(a);
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
