package patterns;

/*
E
DE
CDE
BCDE
ABCDE
*/
public class Pattern18 {
    public static void main(String[] args) {
        char start = 'E';
        for (int i = 0; i < 5; i++) {
            char inner = start;
            for (int j = 0; j <= i ; j++) {
                System.out.print(inner);
                ++inner;
            }
            System.out.println();
            --start;
        }
    }
}
