package patterns;

/*

A
AB
ABC
ABCD
ABCDE

*/
public class Pattern14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            char c = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                ++c;
            }
            System.out.println();
        }
    }
}
