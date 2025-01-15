package patterns;

/*
ABCDE
ABCD
ABC
AB
A
*/
public class Pattern15 {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 0; i <= 5; i++) {
            char a = 'A';
            for (int j = 0; j <= c-i-1; j++) {
                System.out.print(a);
                ++a;
            }
            System.out.println();
        }
    }
}
